package kodlama.io.hrmsProject.core.utility.verifications.concretes;

import org.springframework.stereotype.Service;

import kodlama.io.hrmsProject.core.utility.result.Result;
import kodlama.io.hrmsProject.core.utility.result.SuccesResult;
import kodlama.io.hrmsProject.core.utility.verifications.abstracts.EmailVerificationService;

@Service
public class EmailVerificationManager implements EmailVerificationService {

	@Override
	public Result verifyEmail(String email) {
		
		return new SuccesResult();
	}

}
