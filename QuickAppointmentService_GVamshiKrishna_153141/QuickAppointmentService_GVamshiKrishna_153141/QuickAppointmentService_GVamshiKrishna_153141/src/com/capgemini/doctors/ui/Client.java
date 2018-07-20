package com.capgemini.doctors.ui;

import java.nio.charset.MalformedInputException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.exceptions.QASExceptions;
import com.capgemini.doctors.service.DoctorAppointmentService;
import com.capgemini.doctors.service.IDoctorAppointmentService;

public class Client 
{
	private IDoctorAppointmentService doctorAppointmentService;
	
	public Client()
	{
		doctorAppointmentService = new DoctorAppointmentService();
	}
	
	public void menu()
	{
		//displaying menu
		Scanner console = new Scanner( System.in );
		System.out.println("**********Wel-come********");
		System.out.println("   ________MENU_______    ");
		System.out.println("1) Book Doctor Appointment"); 
		System.out.println("2) View Doctor Appointment");
		System.out.println("3) Exit");
		
		//taking menu input from user
		System.out.print("\nEnter Your Choice: ");
		int choice = console.nextInt();
		

		switch (choice) 
		{
		case 1:	
			
			//getting details from user
			System.out.print(" Enter Patients Name:");
			String patientName=console.next();
			
			System.out.print("Enter your mobile number:");
			String phoneNumber=console.next();
		
			System.out.print("Enter your Email id:");
			String email=console.next();
			
			System.out.print("Enter your gender:");
			String gender= console.next();
			
			System.out.print("Enter your appointment date(dd-mm-yyyy):");
			String appointmentDate=console.next();
			
			System.out.print("Enter your age:");
			int age=console.nextInt();
			
			System.out.print("Enter your Problem Name:");
			String problemName=console.next();
			
			DoctorAppointment doctorAppointment = new DoctorAppointment();
			
			//setting details given by user
			doctorAppointment.setPatientName(patientName);
			doctorAppointment.setPhoneNumber(phoneNumber);
			doctorAppointment.setEmail(email);
			doctorAppointment.setGender(gender);
			doctorAppointment.setAppointmentDate(convertToDate(appointmentDate));
			doctorAppointment.setAge(age);
			doctorAppointment.setProblemName(problemName);
			
			try
			{
				int appointmentId= doctorAppointmentService.addDoctorAppointmentDetails(doctorAppointment);
				System.out.println("Your Doctor Appointment has been successfully registered, your appointment ID is:"+appointmentId);
			} 
			catch (QASExceptions e) 
			{
				System.out.println("Sorry you have entered incorrect details"+e);
			}
			break;
			
		case 2:
			System.out.print("Enter the Appointment Id:");
			int appointmentId= console.nextInt();
			
			try 
			{
				doctorAppointment=doctorAppointmentService.getAppointmentDetails(appointmentId);
				//displaying appointment status for given apppointment ID
				System.out.print("Patient Name		:"+doctorAppointment.getPatientName()+"\n");
				System.out.print("Appointment Status:"+doctorAppointment.getAppointmentStatus()+"\n");
				if(doctorAppointment.getDoctorName()==null)
					System.out.println("Doctor Name       :"+"  "+"\n");
				else
					System.out.print("Doctor Name       :"+doctorAppointment.getDoctorName()+"\n");
			}
			catch (QASExceptions e) 
			{
				System.out.println("Please enter the correct appointmentId");
			}
			break;
		
		case 3:
			doctorAppointmentService.exitApplication();
			break;
			
		default:
			System.out.println("You have selected for wrong menu option. Please try again ");
			break;
		}
			
		
	}	
	
	//converting string format date to localdate
	public LocalDate convertToDate(String dateInString)
	{	
		
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate localDate= LocalDate.parse(dateInString, formatter);
		
		return localDate;
	}
	public static void main(String[] args) 
	{
		Client client = new Client();
		while(true)
		{
			client.menu();
		}
	}
}