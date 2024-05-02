package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.exceptions.InvalidSalaryException;
import com.model.JobListing;

public interface JobListingdao {

	int save(JobListing joblisting)throws SQLException,InvalidSalaryException;
	List<JobListing> getJobListings() throws SQLException;
}
