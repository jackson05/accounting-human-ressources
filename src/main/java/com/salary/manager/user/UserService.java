package com.salary.manager.user;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public User create(User user) {
		return userRepo.save(user);
	}
	

}
