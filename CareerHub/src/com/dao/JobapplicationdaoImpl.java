package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.JobApplication;

public class JobapplicationdaoImpl implements Jobapplicationdao{

	@Override
	public int applyForJob(int jobID, String coverLetter) throws SQLException {
		
		return 0;
	}

	@Override
	public List<JobApplication> getApplicationsFOrJob() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
