package com.cognizant.medical.reporities;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.medical.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);
}
