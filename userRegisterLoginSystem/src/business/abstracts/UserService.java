package business.abstracts;

import entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void signIn(User user);
}
