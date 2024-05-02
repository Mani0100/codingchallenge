package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.JobApplication;

public interface Jobapplicationdao {
	
	int applyForJob(int jobID,  String coverLetter) throws SQLException;
	List<JobApplication> getApplicationsFOrJob() throws SQLException;

}
