package com.capgemini.core.util;
import java.util.*;
import com.capgemini.core.beans.Enquiry;

public class DBUtil 
{
	private List<Enquiry> enquiries = new ArrayList<Enquiry>();
	
	{
		enquiries.add(new Enquiry("vamshi","Krishna","M","Java",101));
	}
	
	public List<Enquiry> getEnquiries()
	{
		return enquiries;
	}
	
	public void setEmployees(List<Enquiry> enquiries)
	{
		this.enquiries= enquiries;
	}
}
