package com.model;

import java.util.Objects;

public class Company {
	
	private int CompanyId;
	private String CompanyName;
	private String Location;
	public Company(int companyId, String companyName, String location) {
		super();
		CompanyId = companyId;
		CompanyName = companyName;
		Location = location;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCompanyId() {
		return CompanyId;
	}
	public void setCompanyId(int companyId) {
		CompanyId = companyId;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "Company [CompanyId=" + CompanyId + ", CompanyName=" + CompanyName + ", Location=" + Location + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(CompanyId, CompanyName, Location);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		return CompanyId == other.CompanyId && Objects.equals(CompanyName, other.CompanyName)
				&& Objects.equals(Location, other.Location);
	}

	
}
