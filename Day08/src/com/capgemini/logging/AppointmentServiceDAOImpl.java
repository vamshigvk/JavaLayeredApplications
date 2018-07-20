package com.capgemini.logging;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class AppointmentServiceDAOImpl implements AppointmentServiceDAO 
{
	static Logger myLogger =
			Logger.getLogger(AppointmentServiceDAOImpl.class.getName());
	
	
	private List<Appointment> appointments = new ArrayList<Appointment>();
	private Map<String, String> doctorSpeciality  = new HashMap<String, String>();
	private int appointmentRequestId = 1000;
	
	{
		doctorSpeciality.put("Heart", "Dr. Brijesh Kumar");
		doctorSpeciality.put("Gynecology", "Dr. Sharda Singh");
		doctorSpeciality.put("Diabetes", "Dr. Heena Khan");
		doctorSpeciality.put("ENT", "Dr. Paras Mal");
		doctorSpeciality.put("Bone", "Dr. Renuka Kher");
		doctorSpeciality.put("Dermatology", "Dr. Kanika Kapoor");
		
		
	}
	
	public int generateAppointmentRequestId() {
		return ++appointmentRequestId;
	}
	
	@Override
	public int bookAppointment(Appointment appointment) throws AppointmentServiceException 
	{
		myLogger.info("Attempting to book appointment");
		
		//set appointment request id
		appointment.setId( generateAppointmentRequestId() );
		
		
		//Below code checks if clinic has doctor of the requested speciality
		//if yes then assign and change status to approved
		String problem  = appointment.getProblem();
		
		if( doctorSpeciality.get(problem) != null )
		{
			myLogger.warn("Problem name is matching so status is approved");
			appointment.setAppointmentStatus("Approved");
			appointment.setDoctorAssigned( doctorSpeciality.get(problem) );
		}
		
		//add appointment request irrespective of approval status
		appointments.add( appointment );
		
		return appointment.getId();
	}
	@Override
	public Appointment getAppointmentStatus(int appointmentRequetId) throws AppointmentServiceException {
		
		myLogger.info("attemping to execute getAppointmentStatus");
		
		Appointment appointment = null;
		
		int index = appointments.indexOf( new Appointment( appointmentRequetId ) );
		
		//check if appointment request exists
		if( index == -1 )
		{
			myLogger.fatal("appointment request with id " + appointmentRequetId + " not found");
			throw new AppointmentServiceException("Sorry No Appointment Request exists with id " + appointmentRequetId);
		}
		//else get the appointment which exists
		appointment = appointments.get( index ); 
		
		return appointment;
	}

}
