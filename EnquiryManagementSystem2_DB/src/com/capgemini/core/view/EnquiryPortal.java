package com.capgemini.core.view;

import java.util.Scanner;

import com.capgemini.core.beans.Enquiry;
import com.capgemini.core.exceptions.EnquiryExceptions;
import com.capgemini.core.service.EnquiryService;
import com.capgemini.core.service.EnquiryServiceImpl;

public class EnquiryPortal 
{

	private EnquiryService enquiryService;
	
	public EnquiryPortal()
	{
			enquiryService= new EnquiryServiceImpl();
	}
	
	public void menu()
	{
		System.out.println("**Menu**");
		System.out.println("\n1.Add an enquiry");
		System.out.println("2.Get an Enquiry using enquiryID");
		
		Scanner console= new Scanner(System.in);
		System.out.println("\nPlease select an option");
		
		int choice = console.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter FirstName:");
			String firstName=console.next();
			
			System.out.println("Enter LastName:");
			String lastName=console.next();
			
			System.out.println("Enter Gender:");
			String gender=console.next();
			
			System.out.println("Enter Technology Interested:");
			String technologyInterested=console.next();
			
			Enquiry enquiry = new Enquiry();
			
			enquiry.setFirstName(firstName);
			enquiry.setLastName(lastName);
			enquiry.setGender(gender);
			enquiry.setTechnologyInterested(technologyInterested);
			
			int enquiryID;
			try {
				enquiryID = enquiryService.addEnquiry(enquiry);
				System.out.println("Employee added successfully with enquiryID:"+enquiryID);
				
			} catch (EnquiryExceptions e) {
			
				e.printStackTrace();
			}
			break;
			
		case 2:
			System.out.println("Enter your EnquiryID ");
			int enquiryID1=console.nextInt();
			try {
				enquiry= enquiryService.getEnquiry(enquiryID1);
				
				System.out.println("EnquiryID:"+ enquiry.getEnquiryID());
				System.out.println("FirstName:"+enquiry.getFirstName());
				System.out.println("LastName:"+enquiry.getLastName());
				System.out.println("Gender:"+enquiry.getGender());
				System.out.println("Technology Interested:"+enquiry.getTechnologyInterested());
				
			} catch (EnquiryExceptions e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break; 
			
		default:
			
		}
		
	}
		
	public static void main(String[] args) 
	{
		EnquiryPortal ep= new EnquiryPortal();
		while(true)
		{
		ep.menu();
		}
	}
}

