package com.capgemini.logging;

public interface AppointmentServiceDAO 
{
	public int bookAppointment(Appointment appointment) throws AppointmentServiceException;
	public Appointment getAppointmentStatus( int appointmentRequetId) throws AppointmentServiceException;
	
}
