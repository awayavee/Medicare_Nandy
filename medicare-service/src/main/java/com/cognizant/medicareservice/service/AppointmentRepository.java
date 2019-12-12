package com.cognizant.medicareservice.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.medicareservice.entities.Appoinment;

public interface AppointmentRepository extends JpaRepository<Appoinment, Integer> {

}
