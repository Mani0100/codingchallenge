package com.model;

import java.util.Objects;

public class JobApplication {

	private int ApplicationId;
	private int JobId;
	private int ApplicantId;
	private String ApplicationDate;
	private String CoverLetter;
	public JobApplication(int applicationId, int jobId, int applicantId, String applicationDate, String coverLetter) {
		super();
		ApplicationId = applicationId;
		JobId = jobId;
		ApplicantId = applicantId;
		ApplicationDate = applicationDate;
		CoverLetter = coverLetter;
	}
	public JobApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getApplicationId() {
		return ApplicationId;
	}
	public void setApplicationId(int applicationId) {
		ApplicationId = applicationId;
	}
	public int getJobId() {
		return JobId;
	}
	public void setJobId(int jobId) {
		JobId = jobId;
	}
	public int getApplicantId() {
		return ApplicantId;
	}
	public void setApplicantId(int applicantId) {
		ApplicantId = applicantId;
	}
	public String getApplicationDate() {
		return ApplicationDate;
	}
	public void setApplicationDate(String applicationDate) {
		ApplicationDate = applicationDate;
	}
	public String getCoverLetter() {
		return CoverLetter;
	}
	public void setCoverLetter(String coverLetter) {
		CoverLetter = coverLetter;
	}
	@Override
	public String toString() {
		return "JobApplication [ApplicationId=" + ApplicationId + ", JobId=" + JobId + ", ApplicantId=" + ApplicantId
				+ ", ApplicationDate=" + ApplicationDate + ", CoverLetter=" + CoverLetter + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(ApplicantId, ApplicationDate, ApplicationId, CoverLetter, JobId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JobApplication other = (JobApplication) obj;
		return ApplicantId == other.ApplicantId && Objects.equals(ApplicationDate, other.ApplicationDate)
				&& ApplicationId == other.ApplicationId && Objects.equals(CoverLetter, other.CoverLetter)
				&& JobId == other.JobId;
	}
	
	
	
	
}
