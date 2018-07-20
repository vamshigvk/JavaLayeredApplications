package com.capgemini.core.service;

import java.util.ArrayList;

import com.capgemini.core.beans.Enquiry;
import com.capgemini.core.exceptions.EnquiryExceptions;

import com.capgemini.core.model.EnquiryDAO;
import com.capgemini.core.model.EnquiryDAOImpl;

public class EnquiryServiceImpl implements EnquiryService {

	ArrayList<Enquiry> enquiries = new ArrayList<Enquiry>();

	
	private EnquiryDAO enquiryDAO;
	
	public EnquiryServiceImpl()
	{
		enquiryDAO = new EnquiryDAOImpl();
	}
	@Override
	public int addEnquiry(Enquiry enquiry) throws EnquiryExceptions 
	{
		int enquiryID=0;
		if(enquiries==null)
		{
			throw new NullPointerException();
		}
		if(enquiry.getFirstName()==null && enquiry.getLastName()==null && enquiry.getGender()==null && enquiry.getTechnologyInterested()==null)
		{
			throw new IllegalArgumentException();
		}
		if(enquiries.contains(enquiry))
		{
			return 0;
		}
		if(enquiries.add(enquiry))
		{
			return 1;
		}
		
		enquiryID=enquiryDAO.addEnquiry(enquiry);
	return enquiryID;
	}

	@Override
	public Enquiry getEnquiry(int enquiryID) throws EnquiryExceptions 
	{
	
		Enquiry enquiry=null;
		enquiry = enquiryDAO.getEnquiry(enquiryID);
		
		return enquiry;
	}

}
