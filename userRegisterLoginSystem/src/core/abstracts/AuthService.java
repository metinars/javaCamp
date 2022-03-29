package core.abstracts;

import entities.concretes.User;

public interface AuthService {
	void signInToSystem(User user);
	void signUpToSystem(User user);
}
