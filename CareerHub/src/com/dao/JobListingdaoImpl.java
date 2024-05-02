package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exceptions.InvalidSalaryException;
import com.model.JobListing;
import com.utility.DBUtility;

public class JobListingdaoImpl implements JobListingdao{

	@Override
	public int save(JobListing joblisting) throws SQLException, InvalidSalaryException {
		Connection con = DBUtility.dbConnect();
		String sql ="INSERT INTO joblisting (job_id,job_title, job_description, job_location, salary, job_type, posted_date, company_company_id) +"
				+ "values(?,?,?,?,?,?,?,?,";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, joblisting.getJobId());
		pstmt.setString(2, joblisting.getJobTitle());
		pstmt.setString(3, joblisting.getJobDescription());
		pstmt.setString(4, joblisting.getJobLocation());
		pstmt.setDouble(5, joblisting.getSalary());
		pstmt.setString(6, joblisting.getJobType());
		pstmt.setString(7, joblisting.getPostedDate());
		pstmt.setInt(8, joblisting.getCompanyId());
		
		int status = pstmt.executeUpdate();
		DBUtility.dbclose();
		return status;
	}

	@Override
	public List<JobListing> getJobListings() throws SQLException {
		Connection con = DBUtility.dbConnect();
		String sql = "Select * from joblisting";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		ResultSet rst =pstmt.executeQuery();
		List<JobListing>list = new ArrayList<>();
		
		while(rst.next()== true) {
			int id = rst.getInt("job_id");
			String JobTitle = rst.getString("job_title");
			String JobDescription= rst.getString("job_description");
			String JobLocation=rst.getString("job_location");
			Double Salary=rst.getDouble("salary");
			String JobType=rst.getString("job_type");
			String PostedDate=rst.getString("posted_date");
			int CompanyId=rst.getInt("Company_company_id");
			
			JobListing jobListing = new JobListing(id,JobTitle,JobDescription,JobLocation,Salary,JobType,PostedDate,CompanyId);
			list.add(jobListing);
		}
		DBUtility.dbclose();
		return list;
	}
}
