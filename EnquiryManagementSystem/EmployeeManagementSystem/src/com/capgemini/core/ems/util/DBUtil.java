package com.capgemini.core.ems.util;
import java.util.*;

import com.capgemini.core.ems.beans.Employee;
public class DBUtil 
{

	private	List<Employee> employees=new ArrayList<Employee>(); 


	//init block
	{
		employees.add(new Employee(101, "John",23000,"IT",null,null));
	}

	public List<Employee> getEmployees()
	{
		return employees;
	}

	public void setEmployees(List<Employee> employees)
	{
		this.employees = employees;
	}

}
