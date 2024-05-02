package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Company;
import com.utility.DBUtility;

public class CompanydaoImpl implements Companydao{

	@Override
	public int insertCompany(Company company) throws SQLException {
		Connection con = DBUtility.dbConnect();
		String sql = "INSERT INTO company (company_id,company_name, location)+Values (?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, company.getCompanyId());
		pstmt.setString(2,company.getCompanyName());
		pstmt.setString(3,company.getLocation());
		
		int status = pstmt.executeUpdate();
		DBUtility.dbclose();
		return status;
	}

	@Override
	public List<Company> getCompanies() throws SQLException {
		Connection con = DBUtility.dbConnect();
		String sql = "select * from company";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		
		List<Company> list =new ArrayList<Company>();
		while(rst.next()==true) {
			int CompanyId = rst.getInt("company_id");
			String CompanyName = rst.getString("company_name");
			String Location = rst.getString("location");
			
			Company company = new Company(CompanyId,CompanyName,Location);
			list.add(company);
			
		}
		DBUtility.dbclose();
		return list;
	}
}