package com.service;

import java.sql.SQLException;
import java.util.List;
import com.dao.*;
import com.model.Company;

public class CompanyService {
	
	Companydao companydao = new CompanydaoImpl();

	public int saveCompany(Company company) throws SQLException{
		// TODO Auto-generated method stub
		
		return companydao.insertCompany(company);
	}

	public List<Company> getallCompanies() throws SQLException{
		// TODO Auto-generated method stub
		return companydao.getCompanies();
	}
}
