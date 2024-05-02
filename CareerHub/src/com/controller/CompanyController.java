package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import com.service.*;
import com.model.Company;

public class CompanyController {
	
public static void main(String[] args) {
		
		CompanyService companyService = new CompanyService();
		Scanner sc = new Scanner(System.in);
		
		while(true) {	
		System.out.println("Company Controller");
		System.out.println("Press 1. Insert Company");
		System.out.println("Press 2. Show all companies");
		System.out.println("Press 0. To Exit");
		int input=sc.nextInt();
		if(input==0) {
			System.out.println("Exiting company controller Module ...");
			break;
		}
		
		switch(input) {
		
		case 1:
			
			Random random = new Random(); 
			int randomNumber = random.nextInt(); 
			int companyid =randomNumber<0?randomNumber*-1:randomNumber; 
			System.out.println(companyid);
			
			System.out.println("Enter company name:");
			sc.nextLine();
			String company_name=sc.nextLine();
			
			System.out.println("Enter location : ");
			String location=sc.nextLine();
			
			Company company=new Company(companyid,company_name,location);
			try {
				int status = companyService.saveCompany(company);
				if(status==1) {
					System.out.println("Insert Added to DB...");
				}else {
					System.out.println("Insertion Failed...");
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			break;
			
		case 2:
			
			try {
				List<Company> list = companyService.getallCompanies();
				for(Company c:list) {
					System.out.println(c);
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			break;
			
		}

}
}
}
