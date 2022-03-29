package dataAcces.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	boolean getEmail(String email);
	boolean getPassword(String password);
	List<User>getAll();
}
