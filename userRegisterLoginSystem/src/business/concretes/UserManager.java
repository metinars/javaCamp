package business.concretes;

import business.abstracts.UserCheckService;
import business.abstracts.UserService;
import business.abstracts.VerificationService;
import core.abstracts.AuthService;
import dataAcces.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private UserCheckService userCheckService;
	private VerificationService verificationService;
	private AuthService authService;

	public UserManager(UserDao userDao, UserCheckService userCheckService, VerificationService verificationService, AuthService authService) {
		super();
		this.userDao = userDao;
		this.userCheckService = userCheckService;
		this.verificationService = verificationService;
		this.authService = authService;
		
	}

	@Override
	public void signUp(User user) {
		if(userCheckService.isValid(user) == true) {
			System.out.println("Kullanıcı sisteme kaydedildi: " + user.getFirstName());
			verificationService.sendMail(user.getEmail());
			userDao.add(user);
			this.authService.signInToSystem(user);
		}
	}

	@Override
	public void signIn(User user) {
		verificationService.sendMail(user.getEmail());
		if(userDao.getEmail(user.getEmail()) && userDao.getPassword(user.getPassword()) && 
				verificationService.verificated(user.getEmail())==true) {
			System.out.println("Kullanıcı girişi başarılı");
			
		}else if(verificationService.verificated(user.getEmail())==false) {
			System.out.println("Mail adresi kullanılmıyor. Lütfen mail adresinizi kontrol edin ");
		}else {
			System.out.println("Kullanıcı bilgileri hatalı lütfen kontrol edin");
		}
	}

}
