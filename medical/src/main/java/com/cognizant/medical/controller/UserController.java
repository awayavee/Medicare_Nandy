package com.cognizant.medical.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.medical.entities.User;
import com.cognizant.medical.exception.UserAlreadyExistsException;
import com.cognizant.medical.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping
	public void signUp(@RequestBody @Valid User user) throws UserAlreadyExistsException {
		userService.signUp(user);
	}
	
	@GetMapping("/{username}")
	public boolean userExistingStatus(@PathVariable String username) {
		return userService.userExistingStatus(username);
	}
	@GetMapping("/getuser/{username}")
	public User getUser(@PathVariable String username) {
		return userService.getUser(username);
	}
	
}
