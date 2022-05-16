package kodlama.io.hrmsProject.core.utility.verifications.abstracts;

import kodlama.io.hrmsProject.core.utility.result.Result;

public interface EmailVerificationService {
	public Result verifyEmail(String email);
}
