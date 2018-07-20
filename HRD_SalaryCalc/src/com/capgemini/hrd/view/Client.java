package com.capgemini.hrd.view;

import com.capgemini.hrd.beans.Employee;
import com.capgemini.hrd.exceptions.HRDExceptions;
import com.capgemini.hrd.model.EmployeeDAO;
import com.capgemini.hrd.model.EmployeeDAOImpl;

public class Client 
{
	public static void main(String[] args)
	{
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		
		Employee employee=new Employee();
		
		try {
			employee=employeeDAO.getEmployeeDetails(1011);
			System.out.println(employee);
			
			double currentMonthSalary= employeeDAO.calculateEmployeeSalary(1011, 20);
			System.out.println(currentMonthSalary);
		} catch (HRDExceptions e) {
			
			e.printStackTrace();
		}
	
	}
}
