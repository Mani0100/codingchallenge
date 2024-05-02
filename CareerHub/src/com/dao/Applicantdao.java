package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.exceptions.InvalidEmailFormatHandling;
import com.model.Applicant;

public interface Applicantdao {
	
	int saveapplicant(Applicant applicant) throws SQLException,InvalidEmailFormatHandling;
	List<Applicant> getApplicants() throws SQLException,InvalidEmailFormatHandling;

}
