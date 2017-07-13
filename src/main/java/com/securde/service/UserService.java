package com.securde.service;

import com.securde.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
