package com.capgemini.core.cbs.service;

import java.util.List;

import com.capgemini.core.cbs.beans.GasAgency;
import com.capgemini.core.cbs.exceptions.CBSException;
import com.capgemini.core.cbs.model.GasAgencyDAO;
import com.capgemini.core.cbs.model.GasAgencyDAOImpl;
import com.capgemini.core.cbs.util.DBUtil;

public class GasAgencyServiceImpl implements GasAgencyService 
{
	private GasAgencyDAO gasDAO;
	

	public  GasAgencyServiceImpl()
	{
		
		gasDAO= new GasAgencyDAOImpl();
	}

	
	@Override
	public List<GasAgency> viewAvailability() throws CBSException
	{
		List<GasAgency> gasAgencies=null;
		gasAgencies=gasDAO.viewAvailability();
		return gasAgencies;
	}

	@Override
	public boolean booking(String agencyName, String location, int cylinderCount) throws CBSException 
	{
		
		
		return gasDAO.booking(agencyName, location, cylinderCount);
	}

}
