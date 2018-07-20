package com.capgemini.core.cbs.util;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.core.cbs.beans.GasAgency;

public class DBUtil {
	private	List<GasAgency> gasagencies=new ArrayList<GasAgency>(); 


	//init block
	{
		gasagencies.add(new GasAgency("jyothi", "pune", 30));
		gasagencies.add(new GasAgency("saisree", "bombay", 20));
		gasagencies.add(new GasAgency("soumya", "hyderabad", 10));
	}

	public List<GasAgency>getGasAgencies()
	{
		return gasagencies;
	}

}
