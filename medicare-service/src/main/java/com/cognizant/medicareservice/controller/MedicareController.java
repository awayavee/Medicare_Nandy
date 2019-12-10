package com.cognizant.medicareservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.medicareservice.entities.Agent;
import com.cognizant.medicareservice.entities.Doctor;
import com.cognizant.medicareservice.entities.Patient;
import com.cognizant.medicareservice.service.AgentService;
import com.cognizant.medicareservice.service.DoctorService;
import com.cognizant.medicareservice.service.PatientService;

@RestController
@RequestMapping("/medicare")
public class MedicareController {
	@Autowired
	AgentService agentService;
	@Autowired
	PatientService patientService;
	@Autowired
	DoctorService doctorService;

	@GetMapping("/getallagents")
	public List<Agent> getAllAgents() {
		return agentService.getAllAgents();

	}

	@GetMapping("/getallpatients")
	public List<Patient> getAllPatients() {
		return patientService.getAllPatients();

	}

	@GetMapping("/getalldoctors")
	public List<Doctor> getAllDoctors() {
		return doctorService.getAllDoctors();

	}

	@PutMapping("/agent")
	public void modifyAgent(@RequestBody Agent agent) {
		agentService.modifyAgent(agent);
	}

	@PutMapping("/patient")
	public void modifyPatient(@RequestBody Patient patient) {
		patientService.modifyPatient(patient);
	}

	@PutMapping("/doctor")
	public void modifyDoctor(@RequestBody Doctor doctor) {
		doctorService.modifyDoctor(doctor);
	}

	@PutMapping("/agentstatus")
	public void modifyAgentStatus(@RequestBody Integer id) {
		agentService.modifyAgentStatus(id);
	}

	@PutMapping("/doctorstatus")
	public void modifyDoctorStatus(@RequestBody Integer id) {
		doctorService.modifyDoctorStatus(id);
	}

	@PutMapping("/patientstatus")
	public void modifyPatientStatus(@RequestBody Integer id) {
		patientService.modifyPatientStatus(id);
	}
}
