package com.service;
import java.sql.SQLException;
import java.util.List;

import com.dao.*;
import com.exceptions.InvalidSalaryException;
import com.model.JobListing;
public class JobListingService {
	
	JobListingdao jobListingdao = new JobListingdaoImpl();

	public int save(JobListing jobListing) throws SQLException,InvalidSalaryException{
		
		if(jobListing.getSalary()<0 ) {
			throw new InvalidSalaryException("Salary cannot be negative");
		}
		return jobListingdao.save(jobListing);
	}

	public List<JobListing> getallJobListings() throws SQLException {
		
		return jobListingdao.getJobListings();
	}
	
	

}
