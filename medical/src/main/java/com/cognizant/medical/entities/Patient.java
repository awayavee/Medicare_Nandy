package com.cognizant.medical.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pt_id")
	private int id;
	@Column(name = "pt_first_name")
	private String firstName;
	@Column(name = "pt_last_name")
	private String lastName;
	@Column(name = "pt_age")
	private int age;
	@Column(name = "pt_gender")
	private String gender;
	@Column(name = "pt_date_of_birth")
	private Date dateOfBirth;
	@Column(name = "pt_contact_no")
	private String contactNo;
	@Column(name = "pt_alt_contact_no")
	private String altContactNo;
	@Column(name = "pt_email")
	private String email;
	@Column(name = "pt_password")
	private String password;
	@Column(name = "pt_address_1")
	private String address1;
	@Column(name = "pt_address_2")
	private String address2;
	@Column(name = "pt_city")
	private String city;
	@Column(name = "pt_state")
	private String state;
	@Column(name = "pt_zip_code")
	private String zipCode;
	@Column(name = "pt_status")
	private boolean status;

	public Patient() {
		super();
	}

	public Patient(int id, String firstName, String lastName, int age, String gender, Date dateOfBirth,
			String contactNo, String altContactNo, String email, String password, String address1, String address2,
			String city, String state, String zipCode, boolean status) {
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
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
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

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", contactNo=" + contactNo + ", altContactNo="
				+ altContactNo + ", email=" + email + ", password=" + password + ", address1=" + address1
				+ ", address2=" + address2 + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}

}
