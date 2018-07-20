package com.capgemini.core.model;

import java.util.*;

import com.capgemini.core.beans.Enquiry;
import com.capgemini.core.exceptions.EnquiryExceptions;
public interface EnquiryDAO 
{
	public int addEnquiry(Enquiry enquiry)throws EnquiryExceptions;
	
	public Enquiry getEnquiry(int enquiryID)throws EnquiryExceptions;
	
	
}
