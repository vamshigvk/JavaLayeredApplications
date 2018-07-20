package com.cg.eis.service;
//lab assignment 5-1
import java.util.HashMap;

import com.cg.eis.bean.Employee;

public class EmployeeServicesImpl implements EmployeeServices {

	
	
	@Override
	public String servicesEligibility(Employee emp)
	{
			double salary=emp.getSalary();
			String designation=emp.getDesignation();
		if(salary>5000 && salary<20000 && designation=="System Associate")
		{
		System.out.println("Scheme C");
		return "Scheme C";
		}
		else if(salary>=20000 && salary<40000 && designation=="Programmer")
		{
		System.out.println("Scheme B");	
		return "Scheme B";
		}
		else if(salary>=40000 && designation=="Manager")
		{
		System.out.println("Scheme A");	
		return "Scheme A";
		}
		else if(salary<5000 && designation=="Clerk")
		{
		System.out.println("No Scheme");	
		return "No Scheme";
		}
		else
		return "";


	}

	@Override
	public void addEmployee(Employee emp) 
	{
		
	}

	@Override
	public boolean deleteEmployee(int id) 
	{
		
		return false;
	}

}
