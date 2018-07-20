package com.capgemini.doctors.ui;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.doctors.bean.DoctorAppointment;
import com.capgemini.doctors.dao.DoctorAppointmentDao;
import com.capgemini.doctors.dao.IDoctorAppointmentDao;
import com.capgemini.doctors.exceptions.QASExceptions;

public class ClientTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		System.out.println("Before test method");
	}

	@Before
	public void setUp() throws Exception 
	{
		System.out.println("After test method");
	}

	@After
	public void tearDown() throws Exception
	{
		System.out.println("After class");
	}

	@Test
	public void test1() 
	{
		System.out.println("from ClientTest1");
		DoctorAppointment doctorAppointment = new DoctorAppointment();
		int age=21;
		doctorAppointment.setAge(age);
		int observed= doctorAppointment.getAge();
		assertEquals(observed, age);
		assertTrue(age>1 && age<120);
	}
	
	@Test
	public void test2() 
	{
		System.out.println("From clientTest2");
		DoctorAppointment doctorAppointment = new DoctorAppointment();
		IDoctorAppointmentDao doc= new DoctorAppointmentDao();
		try 
		{
			int id=doc.addDoctorAppointmentDetails(doctorAppointment);
			int expected= doctorAppointment.getAppointmentId();
			int observed=4;
			assertEquals(expected, id);
		}
		catch (QASExceptions e) {
			System.out.println(e);
		}
	}


}
