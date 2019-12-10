package com.cognizant.medical.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.medical.entities.User;
import com.cognizant.medical.exception.UserAlreadyExistsException;
import com.cognizant.medical.reporities.UserRepository;
import com.cognizant.medical.security.AppUserDetailsService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
	@Autowired
	AppUserDetailsService appUserDetailsService;

	@Override
	public void signUp(User user) throws UserAlreadyExistsException {
		appUserDetailsService.signUp(user);
	}

	@Override
	public boolean userExistingStatus(String username) {
		return userRepository.findByUsername(username) == null ? true : false;
	}

	@Override
	public User getUser(String username) {
		return userRepository.findByUsername(username);
	}

}
