package com.capgemini.doctors.service;

import java.util.List;
import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.exceptions.QASExceptions;

public interface IDoctorAppointmentService 
{
	int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment) throws QASExceptions;
	DoctorAppointment getAppointmentDetails(int appointmentId)throws QASExceptions;
	void exitApplication();
	public List<DoctorAppointment> getAppointments() throws QASExceptions;

}
