package com.cognizant.medicareservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.medicareservice.entities.Agent;
import com.cognizant.medicareservice.entities.User;
import com.cognizant.medicareservice.reporities.AgentRepository;
import com.cognizant.medicareservice.reporities.UserRepository;

@Service
public class AgentServiceImpl implements AgentService {
	@Autowired
	AgentRepository agentRepository;
	@Autowired
	UserRepository userRepository;

	@Override
	public List<Agent> getAllAgents() {
		return agentRepository.findAll();
	}

	@Override
	public void modifyAgent(Agent agent) {
		agentRepository.save(agent);
	}

	@Override
	public void modifyAgentStatus(Integer id) {
		Agent agent = agentRepository.findById(id).get();
		User user=userRepository.findByAgent(agent);
		agent=user.getAgent();
		agent.setStatus(!user.isStatus());
		user.setAgent(agent);
		user.setStatus(!user.isStatus());
		userRepository.save(user);
	}

}
