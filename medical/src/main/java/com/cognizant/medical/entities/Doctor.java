package com.cognizant.medical.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dc_id")
	private int id;
	@Column(name = "dc_first_name")
	private String firstName;
	@Column(name = "dc_last_name")
	private String lastName;
	@Column(name = "dc_age")
	private int age;
	@Column(name = "dc_gender")
	private String gender;
	@Column(name = "dc_date_of_birth")
	private Date dateOfBirth;
	@Column(name = "dc_contact_no")
	private String contactNo;
	@Column(name = "dc_alt_contact_no")
	private String altContactNo;
	@Column(name = "dc_email")
	private String email;
	@Column(name = "dc_password")
	private String password;
	@Column(name = "dc_address_1")
	private String address1;
	@Column(name = "dc_address_2")
	private String address2;
	@Column(name = "dc_city")
	private String city;
	@Column(name = "dc_state")
	private String state;
	@Column(name = "dc_zip_code")
	private String zipCode;
	@Column(name = "dc_degree")
	private String degree;
	@Column(name = "dc_speciality")
	private String speciality;
	@Column(name = "dc_work_hours")
	private String workHours;
	@Column(name = "dc_hospital_name")
	private String hospitalName;

	@ManyToMany
	@JoinTable(name = "doctor_medicare_services", joinColumns = @JoinColumn(name = "dms_dc_id"), inverseJoinColumns = @JoinColumn(name = "dms_ms_id"))
	private Set<MedicareServices> medicareServiceList;

	public Doctor() {
		super();
	}

	public Doctor(int id, String firstName, String lastName, int age, String gender, Date dateOfBirth, String contactNo,
			String altContactNo, String email, String password, String address1, String address2, String city,
			String state, String zipCode, String degree, String speciality, String workHours, String hospitalName,
			Set<MedicareServices> medicareServiceList) {
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
		this.degree = degree;
		this.speciality = speciality;
		this.workHours = workHours;
		this.hospitalName = hospitalName;
		this.medicareServiceList = medicareServiceList;
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

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getWorkHours() {
		return workHours;
	}

	public void setWorkHours(String workHours) {
		this.workHours = workHours;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public Set<MedicareServices> getMedicareServiceList() {
		return medicareServiceList;
	}

	public void setMedicareServiceList(Set<MedicareServices> medicareServiceList) {
		this.medicareServiceList = medicareServiceList;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender="
				+ gender + ", dateOfBirth=" + dateOfBirth + ", contactNo=" + contactNo + ", altContactNo="
				+ altContactNo + ", email=" + email + ", password=" + password + ", address1=" + address1
				+ ", address2=" + address2 + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode
				+ ", degree=" + degree + ", speciality=" + speciality + ", workHours=" + workHours + ", hospitalName="
				+ hospitalName + ", medicareServiceList=" + medicareServiceList + "]";
	}

}
