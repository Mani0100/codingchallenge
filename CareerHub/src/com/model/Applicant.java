package com.model;

import java.util.Objects;

public class Applicant {
	
	private int ApplicantId;
	private String FName;
	private String LName;
	private String email;
	private String Phone;
	private String Resume;
	public Applicant(int applicantId, String fName, String lName, String email, String phone, String resume) {
		super();
		ApplicantId = applicantId;
		FName = fName;
		LName = lName;
		this.email = email;
		Phone = phone;
		Resume = resume;
	}
	public Applicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getApplicantId() {
		return ApplicantId;
	}
	public void setApplicantId(int applicantId) {
		ApplicantId = applicantId;
	}
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getResume() {
		return Resume;
	}
	public void setResume(String resume) {
		Resume = resume;
	}
	@Override
	public String toString() {
		return "Applicant [ApplicantId=" + ApplicantId + ", FName=" + FName + ", LName=" + LName + ", email=" + email
				+ ", Phone=" + Phone + ", Resume=" + Resume + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(ApplicantId, FName, LName, Phone, Resume, email);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Applicant other = (Applicant) obj;
		return ApplicantId == other.ApplicantId && Objects.equals(FName, other.FName)
				&& Objects.equals(LName, other.LName) && Objects.equals(Phone, other.Phone)
				&& Objects.equals(Resume, other.Resume) && Objects.equals(email, other.email);
	}
	
	

}
