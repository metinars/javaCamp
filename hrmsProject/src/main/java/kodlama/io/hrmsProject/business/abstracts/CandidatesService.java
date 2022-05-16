package kodlama.io.hrmsProject.business.abstracts;

import java.util.List;

import kodlama.io.hrmsProject.core.utility.result.DataResult;
import kodlama.io.hrmsProject.core.utility.result.Result;
import kodlama.io.hrmsProject.entities.concretes.Candidates;

public interface CandidatesService {
	
	DataResult<List<Candidates>> getAll();
	Result add(Candidates candidates) throws Exception;
}
