package com.cognizant.medicareservice.reporities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.medicareservice.entities.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
