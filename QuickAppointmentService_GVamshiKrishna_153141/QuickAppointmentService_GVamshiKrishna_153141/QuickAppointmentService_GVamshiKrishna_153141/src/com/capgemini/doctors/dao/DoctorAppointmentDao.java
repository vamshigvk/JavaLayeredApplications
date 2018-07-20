package com.capgemini.doctors.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.exceptions.QASExceptions;

public class DoctorAppointmentDao implements IDoctorAppointmentDao 
{
	Map<Integer, DoctorAppointment> appointments = new HashMap<Integer, DoctorAppointment>();
	Map<String, String> doctorSpeciality  = new HashMap<String, String>();
	
	//INIT block for storing problemName and doctorName into hashmap
	{
		doctorSpeciality.put("Heart"		, "Dr. Brijesh Kumar");
		doctorSpeciality.put("Gynecology"	, "Dr. Sharda Singh");
		doctorSpeciality.put("Diabetes"		, "Dr. Heena Khan");
		doctorSpeciality.put("ENT"			, "Dr. Paras Mal");
		doctorSpeciality.put("Bone"			, "Dr. Renuka Kher");
		doctorSpeciality.put("Dermatology"	, "Dr. Kanika Kapoor");	
	}
	
	//Generating random appointmentID
	public int generateAppointmentId()
	{
		int num;
		Random random= new Random();
		num = Math.abs(random.nextInt(10000));
		return num;
	}
	
	@Override
	public int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment) throws QASExceptions 
	{
		//setting appointmentId using above method
		int id=generateAppointmentId();
		doctorAppointment.setAppointmentId(id);
		
		//Below code checks if clinic has doctor of the requested speciality
		//if yes then assign and change status to approved
		String problem  = doctorAppointment.getProblemName();
		
		if( doctorSpeciality.get(problem) != null )
		{
			doctorAppointment.setAppointmentStatus("Approved");
			doctorAppointment.setDoctorName( doctorSpeciality.get(problem) );
		}
		
		//adding appointment status irrespective of appointmentStatus
		appointments.put(doctorAppointment.getAppointmentId(), doctorAppointment);
		
		//returns generated appointmentId
		return doctorAppointment.getAppointmentId();
	}

	@Override
	public DoctorAppointment getAppointmentDetails(int appointmentId) throws QASExceptions
	{
		//creating an object for doctorAppointment class
		DoctorAppointment doctorAppointment = new DoctorAppointment();
		
		//Validating appointmentID
		if(appointments.containsKey(appointmentId)==false)
			throw new QASExceptions("No such appointmentId exists with us. SORRY!!");
		
		//getting appointment details if appointmentId exists
		doctorAppointment = appointments.get(appointmentId);
		
		//returning doctorAppointment details
		return doctorAppointment;
	}

	@Override
	public void exitApplication() 
	{
		//exiting the application with 0 status
		System.exit(0);
	}

	@Override
	public List<DoctorAppointment> getAppointments() throws QASExceptions 
	{
		//returns all the hashmap values by typeCasting to a ListArray
		return new ArrayList<DoctorAppointment>(appointments.values());
	}

}
