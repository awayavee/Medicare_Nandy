package com.cognizant.medicareservice.reporities;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.medicareservice.entities.MedicareServices;


public interface MedicareServicesRepository extends JpaRepository<MedicareServices, Integer> {

}
