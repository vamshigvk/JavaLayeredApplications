package com.capgemini.logging;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.log4j.PropertyConfigurator;

public class Client 
{
	public static void main(String[] args) 
	{
		PropertyConfigurator.configure("log4j.properties");
		
		AppointmentServiceDAO appointmentServiceDAO;	
		appointmentServiceDAO = new AppointmentServiceDAOImpl();
		
		Appointment appointment = new Appointment();
		
		appointment.setPatientName("Eric");
		appointment.setPhoneNumber(9898989898L);
		appointment.setEmail("eric@gmail.com");
		appointment.setGender("Male");
		appointment.setAge(32);
		appointment.setProblem("Heart");
		appointment.setDate( getDateFromString("04-05-2018") );
		
		try 
		{
			int appointmentRequestId = 
					appointmentServiceDAO.bookAppointment( appointment );
			
			System.out.println("Appointment Request ID : " + appointmentRequestId );
			
			
			Appointment appointment2 = appointmentServiceDAO.getAppointmentStatus( appointmentRequestId );
			
			System.out.println(appointment2);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static Date getDateFromString( String dateInString )
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		LocalDate localDate = LocalDate.parse(dateInString , formatter);

		java.util.Date date = java.sql.Date.valueOf( localDate );

		return date;
	}
}
