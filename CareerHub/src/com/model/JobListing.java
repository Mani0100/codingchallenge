package com.model;

import java.util.Objects;

public class JobListing {
	
	private int JobId;
	private String JobTitle;
	private String JobDescription;
	private String JobLocation;
	private double Salary;
	private String JobType;
	private String PostedDate;
	private int CompanyId;
	public JobListing(int jobId, String jobTitle, String jobDescription, String jobLocation, double salary,
			String jobType, String postedDate, int companyId) {
		super();
		JobId = jobId;
		JobTitle = jobTitle;
		JobDescription = jobDescription;
		JobLocation = jobLocation;
		Salary = salary;
		JobType = jobType;
		PostedDate = postedDate;
		CompanyId = companyId;
	}
	public JobListing() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getJobId() {
		return JobId;
	}
	public void setJobId(int jobId) {
		JobId = jobId;
	}
	public String getJobTitle() {
		return JobTitle;
	}
	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	public String getJobDescription() {
		return JobDescription;
	}
	public void setJobDescription(String jobDescription) {
		JobDescription = jobDescription;
	}
	public String getJobLocation() {
		return JobLocation;
	}
	public void setJobLocation(String jobLocation) {
		JobLocation = jobLocation;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getJobType() {
		return JobType;
	}
	public void setJobType(String jobType) {
		JobType = jobType;
	}
	public String getPostedDate() {
		return PostedDate;
	}
	public void setPostedDate(String postedDate) {
		PostedDate = postedDate;
	}
	public int getCompanyId() {
		return CompanyId;
	}
	public void setCompanyId(int companyId) {
		CompanyId = companyId;
	}
	@Override
	public String toString() {
		return "JobListing [JobId=" + JobId + ", JobTitle=" + JobTitle + ", JobDescription=" + JobDescription
				+ ", JobLocation=" + JobLocation + ", Salary=" + Salary + ", JobType=" + JobType + ", PostedDate="
				+ PostedDate + ", CompanyId=" + CompanyId + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(CompanyId, JobDescription, JobId, JobLocation, JobTitle, JobType, PostedDate, Salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JobListing other = (JobListing) obj;
		return CompanyId == other.CompanyId && Objects.equals(JobDescription, other.JobDescription)
				&& JobId == other.JobId && Objects.equals(JobLocation, other.JobLocation)
				&& Objects.equals(JobTitle, other.JobTitle) && Objects.equals(JobType, other.JobType)
				&& Objects.equals(PostedDate, other.PostedDate)
				&& Double.doubleToLongBits(Salary) == Double.doubleToLongBits(other.Salary);
	}
	
	


}
