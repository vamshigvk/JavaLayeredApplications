package com.cg.eis.service;
//lab assignment 5-1
import com.cg.eis.bean.Employee;

public interface EmployeeServices
{
	String  servicesEligibility(Employee emp);
	public void addEmployee(Employee emp);
	public boolean deleteEmployee(int id);
}

	