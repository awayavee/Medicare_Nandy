package com.cognizant.medical.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicare_services")
public class MedicareServices {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ms_id")
	private int id;
	@Column(name = "ms_medicare_service")
	private String medicareService;
	@Column(name = "ms_service_description")
	private String serviceDescription;
	@Column(name = "ms_amount")
	private double amount;

	public MedicareServices() {

		super();
	}

	public MedicareServices(int id, String medicareService, String serviceDescription, double amount) {
		super();
		this.id = id;
		this.medicareService = medicareService;
		this.serviceDescription = serviceDescription;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMedicareService() {
		return medicareService;
	}

	public void setMedicareService(String medicareService) {
		this.medicareService = medicareService;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
