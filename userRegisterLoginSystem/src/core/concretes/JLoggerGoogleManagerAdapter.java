package core.concretes;

import core.abstracts.AuthService;
import entities.concretes.User;

public class JLoggerGoogleManagerAdapter implements AuthService{
	
	JLoggerGoogleManagerAdapter jLoggerGoogleManagerAdapter = new JLoggerGoogleManagerAdapter();

	@Override
	public void signInToSystem(User user) {

		jLoggerGoogleManagerAdapter.signInToSystem(user);
	}

	@Override
	public void signUpToSystem(User user) {
		jLoggerGoogleManagerAdapter.signUpToSystem(user);
		
	}
	
	
}
