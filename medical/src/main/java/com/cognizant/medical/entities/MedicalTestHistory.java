package com.cognizant.medical.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "medical_test_history")
public class MedicalTestHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mt_report_id")
	private int id;
	@Column(name = "mt_customer_id")
	private int customerId;
	@Column(name = "mt_doctor_id")
	private int doctorId;
	@Column(name = "mt_ms_id")
	private int medicareServiceId;
	@Column(name = "mt_agent_id")
	private int agentId;
	@Column(name = "mt_service_date")
	private Date serviceDate;
	@Column(name = "mt_test_result_date")
	private Date testResultDate;
	@Column(name = "mt_diag_1_actual_value")
	private int diag1_actual_value;
	@Column(name = "mt_diag_1_normal_range")
	private int diag1_normal_range;
	@Column(name = "mt_diag_2_actual_value")
	private int diag2_actual_value;
	@Column(name = "mt_diag_2_normal_range")
	private int diag2_normal_range;
	@Column(name = "mt_diag_3_actual_value")
	private int diag3_actual_value;
	@Column(name = "mt_diag_3_normal_range")
	private int diag3_normal_range;
	@Column(name = "mt_diag_4_actual_value")
	private int diag4_actual_value;
	@Column(name = "mt_diag_4_normal_range")
	private int diag4_normal_range;
	@Column(name = "mt_diag_5_actual_value")
	private int diag5_actual_value;
	@Column(name = "mt_diag_5_normal_range")
	private int diag5_normal_range;
	@Column(name = "mt_diag_6_actual_value")
	private int diag6_actual_value;
	@Column(name = "mt_diag_6_normal_range")
	private int diag6_normal_range;
	@Column(name = "mt_doc_comments")
	private String doctorComment;
	@Column(name = "mt_other_info")
	private String otherInfo;
	@ManyToOne
	@JoinColumn(name = "mt_pt_id")
	private Patient patient;

	public MedicalTestHistory() {
		super();
	}

	public MedicalTestHistory(int id, int customerId, int doctorId, int medicareServiceId, int agentId,
			Date serviceDate, Date testResultDate, int diag1_actual_value, int diag1_normal_range,
			int diag2_actual_value, int diag2_normal_range, int diag3_actual_value, int diag3_normal_range,
			int diag4_actual_value, int diag4_normal_range, int diag5_actual_value, int diag5_normal_range,
			int diag6_actual_value, int diag6_normal_range, String doctorComment, String otherInfo, Patient patient) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.doctorId = doctorId;
		this.medicareServiceId = medicareServiceId;
		this.agentId = agentId;
		this.serviceDate = serviceDate;
		this.testResultDate = testResultDate;
		this.diag1_actual_value = diag1_actual_value;
		this.diag1_normal_range = diag1_normal_range;
		this.diag2_actual_value = diag2_actual_value;
		this.diag2_normal_range = diag2_normal_range;
		this.diag3_actual_value = diag3_actual_value;
		this.diag3_normal_range = diag3_normal_range;
		this.diag4_actual_value = diag4_actual_value;
		this.diag4_normal_range = diag4_normal_range;
		this.diag5_actual_value = diag5_actual_value;
		this.diag5_normal_range = diag5_normal_range;
		this.diag6_actual_value = diag6_actual_value;
		this.diag6_normal_range = diag6_normal_range;
		this.doctorComment = doctorComment;
		this.otherInfo = otherInfo;
		this.patient = patient;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public int getMedicareServiceId() {
		return medicareServiceId;
	}

	public void setMedicareServiceId(int medicareServiceId) {
		this.medicareServiceId = medicareServiceId;
	}

	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public Date getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(Date serviceDate) {
		this.serviceDate = serviceDate;
	}

	public Date getTestResultDate() {
		return testResultDate;
	}

	public void setTestResultDate(Date testResultDate) {
		this.testResultDate = testResultDate;
	}

	public int getDiag1_actual_value() {
		return diag1_actual_value;
	}

	public void setDiag1_actual_value(int diag1_actual_value) {
		this.diag1_actual_value = diag1_actual_value;
	}

	public int getDiag1_normal_range() {
		return diag1_normal_range;
	}

	public void setDiag1_normal_range(int diag1_normal_range) {
		this.diag1_normal_range = diag1_normal_range;
	}

	public int getDiag2_actual_value() {
		return diag2_actual_value;
	}

	public void setDiag2_actual_value(int diag2_actual_value) {
		this.diag2_actual_value = diag2_actual_value;
	}

	public int getDiag2_normal_range() {
		return diag2_normal_range;
	}

	public void setDiag2_normal_range(int diag2_normal_range) {
		this.diag2_normal_range = diag2_normal_range;
	}

	public int getDiag3_actual_value() {
		return diag3_actual_value;
	}

	public void setDiag3_actual_value(int diag3_actual_value) {
		this.diag3_actual_value = diag3_actual_value;
	}

	public int getDiag3_normal_range() {
		return diag3_normal_range;
	}

	public void setDiag3_normal_range(int diag3_normal_range) {
		this.diag3_normal_range = diag3_normal_range;
	}

	public int getDiag4_actual_value() {
		return diag4_actual_value;
	}

	public void setDiag4_actual_value(int diag4_actual_value) {
		this.diag4_actual_value = diag4_actual_value;
	}

	public int getDiag4_normal_range() {
		return diag4_normal_range;
	}

	public void setDiag4_normal_range(int diag4_normal_range) {
		this.diag4_normal_range = diag4_normal_range;
	}

	public int getDiag5_actual_value() {
		return diag5_actual_value;
	}

	public void setDiag5_actual_value(int diag5_actual_value) {
		this.diag5_actual_value = diag5_actual_value;
	}

	public int getDiag5_normal_range() {
		return diag5_normal_range;
	}

	public void setDiag5_normal_range(int diag5_normal_range) {
		this.diag5_normal_range = diag5_normal_range;
	}

	public int getDiag6_actual_value() {
		return diag6_actual_value;
	}

	public void setDiag6_actual_value(int diag6_actual_value) {
		this.diag6_actual_value = diag6_actual_value;
	}

	public int getDiag6_normal_range() {
		return diag6_normal_range;
	}

	public void setDiag6_normal_range(int diag6_normal_range) {
		this.diag6_normal_range = diag6_normal_range;
	}

	public String getDoctorComment() {
		return doctorComment;
	}

	public void setDoctorComment(String doctorComment) {
		this.doctorComment = doctorComment;
	}

	public String getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}