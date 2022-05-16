package kodlama.io.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrmsProject.business.abstracts.CandidatesService;
import kodlama.io.hrmsProject.core.utility.adapters.abstracts.MernisCheckService;
import kodlama.io.hrmsProject.core.utility.result.DataResult;
import kodlama.io.hrmsProject.core.utility.result.ErrorResult;
import kodlama.io.hrmsProject.core.utility.result.Result;
import kodlama.io.hrmsProject.core.utility.result.SuccesDataResult;
import kodlama.io.hrmsProject.core.utility.result.SuccesResult;
import kodlama.io.hrmsProject.core.utility.verifications.abstracts.EmailVerificationService;
import kodlama.io.hrmsProject.dataAcces.abstracts.CandidatesDao;
import kodlama.io.hrmsProject.entities.concretes.Candidates;

@Service
public class CandidatesManager implements CandidatesService {

	private CandidatesDao candidatesDao;
	private MernisCheckService mernisCheckService;
	private EmailVerificationService emailVerificationService;


	
	@Autowired
	public CandidatesManager(CandidatesDao candidatesDao, MernisCheckService mernisCheckService,
			EmailVerificationService emailVerificationService) {
		super();
		this.candidatesDao = candidatesDao;
		this.mernisCheckService = mernisCheckService;
		this.emailVerificationService = emailVerificationService;
	}



	@Override
	public DataResult<List<Candidates>> getAll() {
		
		return new SuccesDataResult<List<Candidates>>(this.candidatesDao.findAll(), "Job seekers listed");
	}

	
	
	private Result isEmailExist(String email) {
		if(this.candidatesDao.findByEmail(email) != null) {
			return new ErrorResult();
		}
		return new SuccesResult();
	}
	
	private Result isNationalityIdExist(String nationalityId) {
		if(this.candidatesDao.findByNationalityId(nationalityId) != null) {
			return new ErrorResult();
		}
		return new SuccesResult();
	}
	
	
	
	
	
	@Override
	public Result add(Candidates candidates) throws Exception {
		if(!this.isEmailExist(candidates.getEmail()).isSucces() || !this.isNationalityIdExist(candidates.getNationalityId()).isSucces()) {
			return new ErrorResult("failed");
		}
		
		
		  mernisCheckService.checkIfRealPerson(candidates);
		  
		  
		  if(!this.mernisCheckService.checkIfRealPerson(candidates).isSucces()) {
			  
			  return new ErrorResult("Person not a valid");
			  
		  }
		  
		 
		 
		
		if(!this.emailVerificationService.verifyEmail(candidates.getEmail()).isSucces()) {
			return new ErrorResult("Check your email please");
		}
		
		this.candidatesDao.saveAndFlush(candidates);
		return new SuccesResult("Job seeker saved");
	}
}
