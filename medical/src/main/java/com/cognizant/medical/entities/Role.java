package com.cognizant.medical.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@Entity
@Table(name = "role")
public class Role {
	private static final Logger LOGGER = LoggerFactory.getLogger(Role.class);
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ro_id")
	private int roleId;
	@Column(name = "ro_name")
	private String roleName;
	@ManyToMany(mappedBy = "roleList", fetch = FetchType.EAGER)
	private Set<User> userList;

	public Role() {
		super();
		LOGGER.debug("Inside Role default  Constructor");
	}

	public Role(int roleId, String roleName, Set<User> userList) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.userList = userList;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<User> getUserList() {
		return userList;
	}

	public void setUserList(Set<User> userList) {
		this.userList = userList;
	}

}




