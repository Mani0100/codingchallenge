package com.controller;

import java.sql.SQLException;
import java.util.*;
import com.exceptions.InvalidSalaryException;
import com.model.JobListing;
import com.service.JobListingService;

public class JobListingController {
	
	public static void main(String[] args) {
		
	JobListingService jobListingService = new JobListingService();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Job Listing Controller");
			System.out.println("Press 1. Insert Job ");
			System.out.println("Press 2. Show All Jobs");
			System.out.println("Press 0. Exit from Controller");
			
			int input=sc.nextInt();
			if(input==0) {
				System.out.println("Exiting Database Manager Module ...");
				break;
			}
			
			Random random = new Random(); 
			int randomNumber = random.nextInt(); 
			int id =randomNumber<0?randomNumber*-1:randomNumber; 
			
			switch(input) {
		case 1:
			
			System.out.println("Enter Job Title ");
			sc.nextLine();
			String JobTitle=sc.nextLine();
			
			System.out.println("Enter Job Description : ");
			String JobDescription=sc.nextLine();
			
			System.out.println("Enter Job Location : ");
			String Location=sc.nextLine();
			
			System.out.println("Enter Salary : ");
			Double Salary=sc.nextDouble();
			
			System.out.println("Enter Job Type (FullTime/HalfTime)");
			String JobType = sc.nextLine();
			
			System.out.println("Enter PostedDate (yyyy-mm-dd) : ");
			String PostedDate=sc.nextLine();
			

			System.out.println("Enter Company Id: ");
			int CompanyId=sc.nextInt();
			
			JobListing jobListing = new JobListing(id,JobTitle,JobDescription,Location,Salary,JobType,PostedDate,CompanyId);
			
			try {
				int status = jobListingService.save(jobListing);
				if(status==1) {
					System.out.println("Insert Added to DB...");
				}else {
					System.out.println("Insertion Failed...");
				}
			} catch (SQLException | InvalidSalaryException e) {
				System.out.println(e.getMessage());
			}
			break;
			
		case 2:
			try {
				List<JobListing> list=jobListingService.getallJobListings();
				for(JobListing j:list) {
					System.out.println(j);
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			break;
			
	}

}
	}
}
