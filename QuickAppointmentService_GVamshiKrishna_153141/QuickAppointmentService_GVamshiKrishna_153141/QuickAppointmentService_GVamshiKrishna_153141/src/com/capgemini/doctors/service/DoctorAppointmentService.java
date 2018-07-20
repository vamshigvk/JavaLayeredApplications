package com.capgemini.doctors.service;

import java.util.List;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.dao.DoctorAppointmentDao;
import com.capgemini.doctors.dao.IDoctorAppointmentDao;
import com.capgemini.doctors.exceptions.QASExceptions;

public class DoctorAppointmentService implements IDoctorAppointmentService
{
	//linking IDoctorAppointmentDao to IDoctorAppointmentService
	private IDoctorAppointmentDao doctorAppointmentDAO;
	
	public DoctorAppointmentService() 
	{
		doctorAppointmentDAO = new DoctorAppointmentDao();
	}
	
	@Override
	public int addDoctorAppointmentDetails(DoctorAppointment doctorAppointment) throws QASExceptions
	{
		int appointmentId;
		
		//getting appointmentId from DAO by adding DoctorAppointment
		appointmentId= doctorAppointmentDAO.addDoctorAppointmentDetails(doctorAppointment);
		
		//returning appointmentId to client
		return appointmentId;
	}

	@Override
	public DoctorAppointment getAppointmentDetails(int appointmentId) throws QASExceptions
	{
		//getting doctorAppointment details from DAO and returning to client
		return doctorAppointmentDAO.getAppointmentDetails(appointmentId);
	}

	@Override
	public void exitApplication()
	{
		doctorAppointmentDAO.exitApplication();
	}

	@Override
	public List<DoctorAppointment> getAppointments() throws QASExceptions 
	{
		return doctorAppointmentDAO.getAppointments();
	}

}
