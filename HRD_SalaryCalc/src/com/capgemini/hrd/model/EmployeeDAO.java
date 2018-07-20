package com.capgemini.hrd.model;

import com.capgemini.hrd.beans.Employee;
import com.capgemini.hrd.exceptions.HRDExceptions;

public interface EmployeeDAO 
{
	public Employee getEmployeeDetails(int empId)throws HRDExceptions ;
	public double calculateEmployeeSalary(int empId, int days)throws HRDExceptions;
	
}
