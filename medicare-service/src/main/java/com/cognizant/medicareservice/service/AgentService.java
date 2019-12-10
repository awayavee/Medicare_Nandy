package com.cognizant.medicareservice.service;

import java.util.List;

import com.cognizant.medicareservice.entities.Agent;
import com.cognizant.medicareservice.entities.User;

public interface AgentService {
	public List<Agent> getAllAgents();

	public void modifyAgent(Agent agent);

	public void modifyAgentStatus(Integer id);
}
