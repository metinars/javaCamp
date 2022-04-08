package kodlama.io.hrmsProject.business.abstracts;

import java.util.List;

import kodlama.io.hrmsProject.entities.concretes.JobPositions;

public interface JobPositionsService {
	List<JobPositions> getAll();
}
