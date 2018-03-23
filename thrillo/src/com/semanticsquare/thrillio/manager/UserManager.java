package com.semanticsquare.thrillio.manager;

import com.semanticsquare.thrillio.entities.User;

public class UserManager {

	private static UserManager instance = new UserManager();

	private UserManager() {
	};

	public static UserManager getInstance() {
		return instance;
	}

	public User createUser(String email, String password, String firstName, String lastName, String userType, long id,
			int gender) {
		User user = new User(); 
		user.setEmail(email);
		user.setFirstName(firstName);
		user.setGender(gender);
		user.setId(id);
		user.setLastName(lastName);
		user.setPassword(password);
		user.setUserType(userType);
		return user;
	}
}
