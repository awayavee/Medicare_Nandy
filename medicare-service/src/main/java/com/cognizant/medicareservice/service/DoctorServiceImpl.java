package com.cognizant.medicareservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.medicareservice.entities.Doctor;
import com.cognizant.medicareservice.entities.User;
import com.cognizant.medicareservice.reporities.DoctorRepository;
import com.cognizant.medicareservice.reporities.UserRepository;

@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	DoctorRepository doctorRepository;
	@Autowired
	UserRepository userRepository;

	@Override
	public List<Doctor> getAllDoctors() {
		return doctorRepository.findAll();
	}

	@Override
	public void modifyDoctor(Doctor doctor) {
		doctorRepository.save(doctor);
	}

	@Override
	public void modifyDoctorStatus(Integer id) {
		Doctor doctor = doctorRepository.findById(id).get();
		User user = userRepository.findByDoctor(doctor);
		doctor=user.getDoctor();
		doctor.setStatus(!user.isStatus());
		user.setDoctor(doctor);
		user.setStatus(!user.isStatus());
		userRepository.save(user);
	}

}
