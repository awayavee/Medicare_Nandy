package com.cognizant.medical.service;


import com.cognizant.medical.entities.User;
import com.cognizant.medical.exception.UserAlreadyExistsException;

public interface UserService {
	public void signUp(User user) throws UserAlreadyExistsException;
	public boolean userExistingStatus(String username);
	public User getUser(String username);
}
