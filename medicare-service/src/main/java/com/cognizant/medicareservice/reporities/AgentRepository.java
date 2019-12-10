package com.cognizant.medicareservice.reporities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.medicareservice.entities.Agent;
@Repository
public interface AgentRepository extends JpaRepository<Agent, Integer> {

}
