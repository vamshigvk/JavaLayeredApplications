package com.capgemini.core.cbs.model;

import java.util.*;

import org.apache.log4j.Logger;

import com.capgemini.core.cbs.beans.GasAgency;
import com.capgemini.core.cbs.exceptions.CBSException;
import com.capgemini.core.cbs.util.DBUtil;



public class  GasAgencyDAOImpl implements GasAgencyDAO 
{
	static Logger myLogger = Logger.getLogger(GasAgencyDAOImpl.class);

	
	private List<GasAgency> gasAgencies;
	private DBUtil dbUtil= new DBUtil();

	public  GasAgencyDAOImpl()
	{
		
		gasAgencies= dbUtil.getGasAgencies();
	}

	@Override
	public List<GasAgency> viewAvailability()throws CBSException 
	{
		myLogger.info("View availability method called");
		myLogger.error("Exception: sorry");
		
		return gasAgencies;
	}

	@Override
	public boolean booking(String agencyName, String location, int cylinderCount) throws CBSException 
	{
			myLogger.info("booking method called");
			myLogger.debug("booking method called");
		
			int index= gasAgencies.indexOf( new GasAgency(agencyName));
			if(index == -1)
			{
				throw new CBSException("Entered agency is not available ");
			}
			
			GasAgency gasAgency= gasAgencies.get(index);
			
			if(cylinderCount>gasAgency.getCylinderCount())
			{
				return false;
			}
			else 
			{
				gasAgency.setCylinderCount(gasAgency.getCylinderCount()-cylinderCount);
				return true;
			}
		
	}


	
}
