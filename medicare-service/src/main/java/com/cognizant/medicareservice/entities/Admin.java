package com.cognizant.medicareservice.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ad_id")
	private int id;
	@Column(name = "ad_first_name")
	private String firstName;
	@Column(name = "ad_last_name")
	private String lastName;
	@Column(name = "ad_age")
	private int age;
	@Column(name = "ad_gender")
	private String gender;
	@Column(name = "ad_date_of_birth")
	private Date dateOfBirth;
	@Column(name = "ad_contact_no")
	private String contactNo;
	@Column(name = "ad_alt_contact_no")
	private String altContactNo;
	@Column(name = "ad_email")
	private String email;
	@Column(name = "ad_password")
	private String password;
	@Column(name = "ad_status")
	private boolean status;

	public Admin() {
		super();
	}

	public Admin(int id, String firstName, String lastName, int age, String gender, Date dateOfBirth, String contactNo,
			String altContactNo, String email, String password, boolean status) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.contactNo = contactNo;
		this.altContactNo = altContactNo;
		this.email = email;
		this.password = password;
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAltContactNo() {
		return altContactNo;
	}

	public void setAltContactNo(String altContactNo) {
		this.altContactNo = altContactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender="
				+ gender + ", dateOfBirth=" + dateOfBirth + ", contactNo=" + contactNo + ", altContactNo="
				+ altContactNo + ", email=" + email + ", password=" + password + "]";
	}

}
