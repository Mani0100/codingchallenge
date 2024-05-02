package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exceptions.InvalidEmailFormatHandling;
import com.model.Applicant;
import com.utility.DBUtility;

public class ApplicantdaoImpl implements Applicantdao{

	@Override
	public int saveapplicant(Applicant applicant) throws SQLException, InvalidEmailFormatHandling {
		Connection con = DBUtility.dbConnect();
		String sql ="INSERT INTO applicant (first_name, last_name, email, phone, resume) values (?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, applicant.getApplicantId());
		pstmt.setString(2, applicant.getFName());
		pstmt.setString(3, applicant.getLName());
		pstmt.setString(4, applicant.getEmail());
		pstmt.setString(5, applicant.getPhone());
		pstmt.setString(6, applicant.getResume());
		
		int status = pstmt.executeUpdate();
		DBUtility.dbclose();
		return status;
	}
		

	@Override
	public List<Applicant> getApplicants() throws SQLException, InvalidEmailFormatHandling {
		Connection con = DBUtility.dbConnect();
		String sql = "select * from applicant";
		PreparedStatement pstmt=con.prepareStatement(sql);
		ResultSet rst=pstmt.executeQuery();
		List<Applicant> list=new ArrayList<>();
		while(rst.next()==true) {
			int id=rst.getInt("applicant_id");
			String first_name = rst.getString("first_name");
			String last_name= rst.getString("last_name");
			String email=rst.getString("email");
			String phone=rst.getString("phone");
			String resume=rst.getString("resume");
			Applicant applicant = new Applicant(id,first_name,last_name,email,phone,resume);
			list.add(applicant);
	}
		DBUtility.dbclose();
		return list;
	}

}
