package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.*;
import com.exceptions.InvalidEmailFormatHandling;
import com.model.Applicant;
public class ApplicantService {
	
	Applicantdao applicantdao = new ApplicantdaoImpl();

	public int saveapplicant(Applicant applicant) throws SQLException, InvalidEmailFormatHandling {
		// TODO Auto-generated method stub
		if(!applicant.getEmail().contains("@")) {
			throw new InvalidEmailFormatHandling("Email given is invalid");
		}
		return applicantdao.saveapplicant(applicant);
	}

	public List<Applicant> getallApplicants() throws SQLException, InvalidEmailFormatHandling{
		// TODO Auto-generated method stub
		return applicantdao.getApplicants();
	}
	
	

}
