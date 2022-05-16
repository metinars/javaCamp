package kodlama.io.hrmsProject.core.utility.adapters.abstracts;

import kodlama.io.hrmsProject.core.utility.result.Result;
import kodlama.io.hrmsProject.entities.concretes.Candidates;

public interface MernisCheckService {
	
	Result checkIfRealPerson(Candidates candidates) throws Exception;
}
