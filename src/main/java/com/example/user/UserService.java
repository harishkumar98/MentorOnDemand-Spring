package com.example.user;

import java.util.List;

public interface UserService {
	  User create(User user);
	  User delete(int id);
	  List<User> findAll();
	  User findById(int id);
	  User update (User user);
	User findUser(String email, String password);
	String check(String userName);

}
