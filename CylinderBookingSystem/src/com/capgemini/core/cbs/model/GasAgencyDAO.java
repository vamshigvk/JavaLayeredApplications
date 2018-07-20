package com.capgemini.core.cbs.model;

import java.util.*;

import com.capgemini.core.cbs.beans.GasAgency;
import com.capgemini.core.cbs.exceptions.CBSException;



public interface GasAgencyDAO 
{
public List<GasAgency> viewAvailability() throws CBSException;
public boolean booking(String agencyName,String location,int cylinderCount)throws CBSException;



}
