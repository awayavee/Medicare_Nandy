package com.cognizant.medicareservice.service;

import java.util.List;

import com.cognizant.medicareservice.entities.Doctor;

public interface DoctorService {
	public List<Doctor> getAllDoctors();
	public void modifyDoctor(Doctor doctor);
	public void modifyDoctorStatus(Integer id);
}
