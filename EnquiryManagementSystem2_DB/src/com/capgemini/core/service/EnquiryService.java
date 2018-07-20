package com.capgemini.core.service;

import com.capgemini.core.beans.Enquiry;
import com.capgemini.core.exceptions.EnquiryExceptions;

public interface EnquiryService 
{

public int addEnquiry(Enquiry enquiry)throws EnquiryExceptions;
	
	public Enquiry getEnquiry(int enquiryID)throws EnquiryExceptions;
	
}
