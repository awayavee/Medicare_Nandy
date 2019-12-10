package com.cognizant.medicareservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.medicareservice.entities.Patient;
import com.cognizant.medicareservice.entities.User;
import com.cognizant.medicareservice.reporities.PatientRepository;
import com.cognizant.medicareservice.reporities.UserRepository;

@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	PatientRepository patientRepository;
	@Autowired
	UserRepository userRepository;
	@Override
	public List<Patient> getAllPatients() {
		return patientRepository.findAll();
	}

	@Override
	public void modifyPatient(Patient patient) {
		patientRepository.save(patient);
	}

	@Override
	public void modifyPatientStatus(Integer id) {
		Patient patient=patientRepository.findById(id).get();
		User user=userRepository.findByPatient(patient);
		patient=user.getPatient();
		patient.setStatus(!user.isStatus());
		user.setPatient(patient);
		user.setStatus(!user.isStatus());
		userRepository.save(user);	
	}

}
