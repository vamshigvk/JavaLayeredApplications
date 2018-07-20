package com.capgemini.core.cbs.service;

import java.util.List;

import com.capgemini.core.cbs.beans.GasAgency;
import com.capgemini.core.cbs.exceptions.CBSException;

public interface GasAgencyService {

public List<GasAgency> viewAvailability() throws CBSException;
public boolean booking(String agencyName,String location,int cylinderCount)throws CBSException;


}
