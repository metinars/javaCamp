package business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import business.abstracts.UserCheckService;
import entities.concretes.User;

public class UserCheckManager implements UserCheckService{
	
	
	List<String> listOfEmail = new ArrayList<String>();

	@Override
	public boolean checkFirstName(User user) {
		if(user.getFirstName().isEmpty()) {
			System.out.println("Bu alan boş geçilemez!");
			return false;
		} else if(user.getFirstName().length() < 2) {
			System.out.println("İsminiz 2 karakterden küçük olamaz");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkLastName(User user) {

		if(user.getLastName().isEmpty()) {
			System.out.println("Bu alan boş geçilemez1");
			return true;
		} else if(user.getLastName().length() < 2) {
			System.out.println("Soy isminiz 2 karakterden küçük olamaz");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkEmail(User user) {

		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		
		if(user.getEmail().isEmpty()) {
			System.out.println("Bu alan boş geçilemez!");
			return false;
		} else if(pattern.matcher(user.getEmail()).find()) {
			System.out.println("Girilen email uygunsuz");
			return false;
		}
		
		return true;
	}

	@Override
	public boolean checkPassword(User user) {

		if(user.getPassword().isEmpty()) {
			System.out.println("Bu alan boş geçilemez!");
			return false;
		} else if(user.getPassword().length() < 6) {
			System.out.println("Parola 6 karakterden az olamaz");
			return false;
		}
		return true;
	}

	@Override
	public boolean uniqueEmail(User user) {
		boolean result = true;
		if(listOfEmail.contains(user.getEmail())) {
			System.out.println("Bu mail adresi ile sisteme daha önce kayıt olunmuş, farklı bir mail adresi deneyiniz.");
			return false;
		}else {
			
			result = true;
			
			listOfEmail.add(user.getEmail());
	
		}
		
		return result;
	}

	@Override
	public boolean isValid(User user) {
		if(checkFirstName(user)&&checkLastName(user)&&checkEmail(user)&&checkPassword(user)&&uniqueEmail(user)==true) {
			return true;
		}
		
	
		return false;
	}

}
