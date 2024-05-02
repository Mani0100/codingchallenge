package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.Company;

public interface Companydao {
	
	int insertCompany(Company company) throws SQLException;
	List<Company> getCompanies() throws SQLException;

}
