package com.cognizant.medicareservice.reporities;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.medicareservice.entities.Agent;
import com.cognizant.medicareservice.entities.Doctor;
import com.cognizant.medicareservice.entities.Patient;
import com.cognizant.medicareservice.entities.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);
	User findByAgent(Agent agent);
	User findByDoctor(Doctor doctor);
	User findByPatient(Patient patient);
}
