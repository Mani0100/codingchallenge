package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.exceptions.InvalidEmailFormatHandling;
import com.model.Applicant;
import com.service.ApplicantService;

public class ApplicantController {

	public static void main(String[] args) {
		
		ApplicantService applicantService = new ApplicantService();
		Scanner sc = new Scanner(System.in);
		
		while(true) {	
		System.out.println("Applicant Controller");
		System.out.println("Press 1. Create Applicant Profile");
		System.out.println("Press 2. show all applicants");
		System.out.println("Press 0. To Exit");
		int input=sc.nextInt();
		if(input==0) {
			System.out.println("Exiting Database Manager Module ...");
			break;
		}
		
		switch(input) {
		
		case 1 :
			
			Random random = new Random(); 
			int randomNumber = random.nextInt(); 
			int Applicantid =randomNumber<0?randomNumber*-1:randomNumber; 
			System.out.println("Enter First Name : ");
			sc.nextLine();
			String FName=sc.nextLine();
			
			System.out.println("Enter Last Name : ");
			String LName=sc.nextLine();
			
			System.out.println("Enter Email : ");
			String email=sc.nextLine();
			
			System.out.println("Enter Phone Number : ");
			String phone=sc.nextLine();
			
			System.out.println("Provide Resume : ");
			String resume=sc.nextLine();
			
			 Applicant applicant=new Applicant(Applicantid,FName,LName,email,phone,resume);
			    try {
					int status = applicantService.saveapplicant(applicant);
					if(status==1) {
						System.out.println("Profile Added to DB...");
					}else {
						System.out.println("Insertion Failed...");
					}
				} catch (SQLException | InvalidEmailFormatHandling e) {
					System.out.println(e.getMessage());
				}
				break;
				
		case 2:
			try {
				List<Applicant> list=applicantService.getallApplicants();
				for(Applicant j:list) {
					System.out.println(j);
				}
			} catch (SQLException | InvalidEmailFormatHandling e) {
				System.out.println(e.getMessage());
			}
			break;
		}
	}
	}
}

