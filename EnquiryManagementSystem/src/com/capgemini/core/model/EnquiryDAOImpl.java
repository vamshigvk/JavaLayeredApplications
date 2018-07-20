package com.capgemini.core.model;
import java.util.*;
import com.capgemini.core.beans.Enquiry;
import com.capgemini.core.exceptions.EnquiryExceptions;
import com.capgemini.core.util.DBUtil;

public class EnquiryDAOImpl implements EnquiryDAO 
{
	private List<Enquiry> enquiries;
	private DBUtil dbUtil= new DBUtil();
	
	private int enquiryID=1000;
	
	public EnquiryDAOImpl()
	{
		enquiries=dbUtil.getEnquiries();
	}
	
	public int generateEnquiryID()
	{
		return ++enquiryID;
		
	}
	@Override
	public int addEnquiry(Enquiry enquiry) throws EnquiryExceptions 
	{
		int enquiryID= generateEnquiryID();
		
		enquiry.setEnquiryID(enquiryID);
		
		enquiries.add(enquiry);
		
		return enquiryID;
	}

	@Override
	public Enquiry getEnquiry(int enquiryID) throws EnquiryExceptions 
	{	
			int index= enquiries.indexOf(new Enquiry(enquiryID));
			return enquiries.get(index);
	}

}
