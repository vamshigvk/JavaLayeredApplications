package com.capgemini.core.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.core.beans.Enquiry;
import com.capgemini.core.exceptions.EnquiryExceptions;
import com.capgemini.core.service.EnquiryService;
import com.capgemini.core.service.EnquiryServiceImpl;

public class EnquiryJunit {
	static EnquiryService enquiryService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		enquiryService= new EnquiryServiceImpl();
		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("AfterClass");
		enquiryService=null;
	}

	@Before
	public void setUp() throws Exception 
	{
		System.out.println("TestExecuting");
	}

	@After
	public void tearDown() throws Exception 
	{
		System.out.println("TestExecuted");
	}

	@Test(expected=NullPointerException.class)
	public void testAddEnqiury1()
	{
		try {
			enquiryService.addEnquiry(null);
		}
		catch (EnquiryExceptions e) 
		{
		
			e.printStackTrace();
		}
	}
	@Test(expected=IllegalArgumentException.class)
	public void testAddEnqiury2()
	{

		EnquiryService enquiryService = new EnquiryServiceImpl();
		
		try {
			enquiryService.addEnquiry(new Enquiry());
		}
		catch (EnquiryExceptions e) 
		{
			e.printStackTrace();
		}
	}
	@Test
	public void testAddEnqiury3()
	{
		EnquiryService enquiryService = new EnquiryServiceImpl();
		try {
			Enquiry enquiry= new Enquiry("vamshi", "krishna", "M", "CS", 1001);
			int obtainedResult=enquiryService.addEnquiry(enquiry);
			int expectedResult=1;
			assertEquals(expectedResult, obtainedResult);
			
			
		}
		catch (EnquiryExceptions e) 
		{
		
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAddProduct4() 
	{
		EnquiryService enquiryService = new EnquiryServiceImpl();
		
		Enquiry enquiry= new Enquiry("vamshi", "krishna", "M", "CS", 1001);
		Enquiry enquiry1= new Enquiry("vamshi", "krishna", "M", "CS", 1001);
		
		try {
			enquiryService.addEnquiry(enquiry);
			int obtainedResult = enquiryService.addEnquiry(enquiry1);
			int expectedResult= 0;
			
			assertEquals(expectedResult, obtainedResult);
		}
		catch (EnquiryExceptions e) 
		{
		
			e.printStackTrace();
		}
		
		

	}

}
