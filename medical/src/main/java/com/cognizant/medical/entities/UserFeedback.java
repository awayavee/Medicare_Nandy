package com.cognizant.medical.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_feedback")
public class UserFeedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ufb_pt_id")
	private int id;
	@Column(name = "ufb_ass_id")
	private int assessmentId;
	@Column(name = "ufb_rq_1")
	private String ratingQues1;
	@Column(name = "ufb_rq_2")
	private String ratingQues2;
	@Column(name = "ufb_rq_3")
	private String ratingQues3;
	@Column(name = "ufb_rq_4")
	private String ratingQues4;
	@Column(name = "ufb_rq_5")
	private String ratingQues5;
	@Column(name = "ufb_rq_6")
	private String ratingQues6;
	@Column(name = "ufb_rq_7")
	private String ratingQues7;
	@Column(name = "ufb_rq_8")
	private String ratingQues8;
	@Column(name = "ufb_rq_9")
	private String ratingQues9;
	@Column(name = "ufb_rq_10")
	private String ratingQues10;
	@Column(name = "ufb_ass_date")
	private Date assessmentDate;
	//@ManyToOne
	//@JoinColumn(name = "ufb_us_id")
	//private User user;

	//@OneToOne
	//@JoinColumn(name = "ufb_fb_ass_id")
	//private Feedback feedback;

	public UserFeedback() {
		super();
	}

	public UserFeedback(int id, int assessmentId, String ratingQues1, String ratingQues2, String ratingQues3,
			String ratingQues4, String ratingQues5, String ratingQues6, String ratingQues7, String ratingQues8,
			String ratingQues9, String ratingQues10, Date assessmentDate) {
		super();
		this.id = id;
		this.assessmentId = assessmentId;
		this.ratingQues1 = ratingQues1;
		this.ratingQues2 = ratingQues2;
		this.ratingQues3 = ratingQues3;
		this.ratingQues4 = ratingQues4;
		this.ratingQues5 = ratingQues5;
		this.ratingQues6 = ratingQues6;
		this.ratingQues7 = ratingQues7;
		this.ratingQues8 = ratingQues8;
		this.ratingQues9 = ratingQues9;
		this.ratingQues10 = ratingQues10;
		this.assessmentDate = assessmentDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAssessmentId() {
		return assessmentId;
	}

	public void setAssessmentId(int assessmentId) {
		this.assessmentId = assessmentId;
	}

	public String getRatingQues1() {
		return ratingQues1;
	}

	public void setRatingQues1(String ratingQues1) {
		this.ratingQues1 = ratingQues1;
	}

	public String getRatingQues2() {
		return ratingQues2;
	}

	public void setRatingQues2(String ratingQues2) {
		this.ratingQues2 = ratingQues2;
	}

	public String getRatingQues3() {
		return ratingQues3;
	}

	public void setRatingQues3(String ratingQues3) {
		this.ratingQues3 = ratingQues3;
	}

	public String getRatingQues4() {
		return ratingQues4;
	}

	public void setRatingQues4(String ratingQues4) {
		this.ratingQues4 = ratingQues4;
	}

	public String getRatingQues5() {
		return ratingQues5;
	}

	public void setRatingQues5(String ratingQues5) {
		this.ratingQues5 = ratingQues5;
	}

	public String getRatingQues6() {
		return ratingQues6;
	}

	public void setRatingQues6(String ratingQues6) {
		this.ratingQues6 = ratingQues6;
	}

	public String getRatingQues7() {
		return ratingQues7;
	}

	public void setRatingQues7(String ratingQues7) {
		this.ratingQues7 = ratingQues7;
	}

	public String getRatingQues8() {
		return ratingQues8;
	}

	public void setRatingQues8(String ratingQues8) {
		this.ratingQues8 = ratingQues8;
	}

	public String getRatingQues9() {
		return ratingQues9;
	}

	public void setRatingQues9(String ratingQues9) {
		this.ratingQues9 = ratingQues9;
	}

	public String getRatingQues10() {
		return ratingQues10;
	}

	public void setRatingQues10(String ratingQues10) {
		this.ratingQues10 = ratingQues10;
	}

	public Date getAssessmentDate() {
		return assessmentDate;
	}

	public void setAssessmentDate(Date assessmentDate) {
		this.assessmentDate = assessmentDate;
	}

}
