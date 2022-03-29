package userRegisterLoginSystem;

import business.abstracts.UserService;
import business.concretes.UserCheckManager;
import business.concretes.UserManager;
import business.concretes.VerificationManager;
import dataAcces.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		
		UserService userService = new UserManager(new HibernateUserDao(),new UserCheckManager(),new VerificationManager(), null);
		userService.signUp(new User(1,"Metin", "Arslan", "arsmetin90@gmail.com", "123456"));
		userService.signIn(new User(1,"Metin", "Arslan", "arsmetin90@gmail.com", "123456"));
		
	}

}
