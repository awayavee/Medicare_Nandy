package com.cognizant.medicareservice.reporities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.medicareservice.entities.Doctor;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
