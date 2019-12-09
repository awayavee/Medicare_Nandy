package com.cognizant.medical.entities;
/*
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user")
public class User {
	private static final Logger LOGGER = LoggerFactory.getLogger(User.class);
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "us_id")
	private int userId;
	@Column(name = "us_username")
	private String username;
	@Column(name = "us_password")
	private String password;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "ur_us_id"), inverseJoinColumns = @JoinColumn(name = "ur_ro_id"))
	@JsonIgnore
	private Set<Role> roleList;

	@OneToOne
	@JoinColumn(name = "us_ad_id")
	private Admin admin;

	@OneToOne
	@JoinColumn(name = "us_pt_id")
	private Patient patient;
	@OneToOne
	@JoinColumn(name = "us_dc_id")
	private Doctor doctor;

	@OneToOne
	@JoinColumn(name = "us_ag_id")
	private Agent agent;

	@Column(name = "us_status")
	private int status;

	public User() {
		super();
		LOGGER.debug("Inside default User  Constructor");
	}

	public User(int userId, String username, String password, Set<Role> roleList, Admin admin, Patient patient,
			Doctor doctor, Agent agent, int status) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.roleList = roleList;
		this.admin = admin;
		this.patient = patient;
		this.doctor = doctor;
		this.agent = agent;
		this.status = status;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(Set<Role> roleList) {
		this.roleList = roleList;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}



}

*/

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user")
public class User {
	private static final Logger LOGGER = LoggerFactory.getLogger(User.class);

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "us_id")
	private int userId;
	@Column(name = "us_username")
	@NotNull(message = "User Name is Required")
	private String username;
	@Column(name = "us_password")
	private String password;
	@Column(name="us_status")
	private boolean status;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "ur_us_id"), inverseJoinColumns = @JoinColumn(name = "ur_ro_id"))
	@JsonIgnore
	private Set<Role> roleList;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "us_ad_id")
	private Admin admin;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "us_pt_id")
	private Patient patient;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "us_dc_id")
	private Doctor doctor;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "us_ag_id")
	private Agent agent;

	public User() {
		super();
		LOGGER.debug("Inside default  Constructor");
	}

	public User(int userId, @NotNull(message = "User Name is Required") String username, String password,
			boolean status, Set<Role> roleList, Admin admin, Patient patient, Doctor doctor, Agent agent) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.status = status;
		this.roleList = roleList;
		this.admin = admin;
		this.patient = patient;
		this.doctor = doctor;
		this.agent = agent;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Set<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(Set<Role> roleList) {
		this.roleList = roleList;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", firstname=" + ", lastname=" + ", password="
				+ password + ", roleList=" + roleList + "]";
	}

}
