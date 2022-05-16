package kodlama.io.hrmsProject.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrmsProject.entities.concretes.Candidates;

public interface CandidatesDao extends JpaRepository<Candidates, Integer>{
	Candidates findByNationalityId(String nationalityId);
	Candidates findByEmail(String email);
}
