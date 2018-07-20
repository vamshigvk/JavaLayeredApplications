package com.capgemini.core.cbs.view;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.apache.log4j.PropertyConfigurator;

import com.capgemini.core.cbs.beans.GasAgency;
import com.capgemini.core.cbs.exceptions.CBSException;
import com.capgemini.core.cbs.service.GasAgencyService;
import com.capgemini.core.cbs.service.GasAgencyServiceImpl;

public class Customer {
	
	public Customer()
	{
		gasAgencyService= new GasAgencyServiceImpl();
	}
	

	private GasAgencyService  gasAgencyService;
	public void  menu() throws CBSException
	{
		System.out.println("1. view availability");
		System.out.println("2.Booking");
		System.out.println("3.Exit");
		System.out.println("\n please select an option");
		Scanner console= new Scanner(System.in);
		
		int choice= console.nextInt();
		
		switch (choice) {
		case 1:
		
				List<GasAgency> gasAgency=gasAgencyService.viewAvailability();
				
				Iterator<GasAgency> it= gasAgency.iterator();
				System.out.println("AgencyName \tLocation \tCylinderCount");
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				
			break;

		case 2:
			System.out.println("Enter AgencyName you are likely to book:");
			String agencyName= console.next();
			
			System.out.println("Enter AgencyLocation you are likely to book:");
			String location=console.next();
			
			System.out.println("Enter CylinderCount you are likely to book:");
			int cylinderCount= console.nextInt();
			
			boolean gas=gasAgencyService.booking(agencyName, location, cylinderCount);
			
			if(gas==true)
			{
				Random rand= new Random();
			int randint = rand.nextInt(1000);
			
				System.out.println("Thank you!!, your request id is :" + randint);
			}
			else if (gas==false) 
			{
			System.out.println("Sorry no Cylinders available at the requested location");	
			}
			break;
		
		case 3: 
			System.exit(0);
			break;
		}
		
		
	}
public static void main(String[] args) throws CBSException 
{
	PropertyConfigurator.configure("log4j.properties");
	
	Customer c=new Customer();
	
	while(true)
	{
		c.menu();
	}
}

}
