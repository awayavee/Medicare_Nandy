package com.cognizant.medicareservice.reporities;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.medicareservice.entities.Role;


public interface RoleRepository extends JpaRepository<Role, Integer> {
	Role findByRoleId(int id);
}
