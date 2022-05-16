package kodlama.io.hrmsProject.core.utility.adapters.concretes;

import java.util.Locale;

import org.springframework.stereotype.Service;

import kodlama.io.hrmsProject.core.utility.adapters.abstracts.MernisCheckService;
import kodlama.io.hrmsProject.core.utility.result.ErrorResult;
import kodlama.io.hrmsProject.core.utility.result.Result;
import kodlama.io.hrmsProject.core.utility.result.SuccesResult;
import kodlama.io.hrmsProject.entities.concretes.Candidates;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class MernisCheckManager implements MernisCheckService{

	@Override
	public Result checkIfRealPerson(Candidates candidates) throws Exception {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		
		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(candidates.getNationalityId()), 
				candidates.getFirstName().toUpperCase(new Locale("tr", "Tr")), 
				candidates.getLastName().toUpperCase(new Locale("tr","Tr")), 
				candidates.getYearOfBirth());
		if(!result) {
			return new ErrorResult();
		}
		return new SuccesResult("Mernis Doğrulandı");
	}
	 
}
