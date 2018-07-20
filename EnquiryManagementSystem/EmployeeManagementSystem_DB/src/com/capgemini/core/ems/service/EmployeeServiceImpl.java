package com.capgemini.core.ems.service;

import java.util.List;

import com.capgemini.core.ems.beans.Employee;
import com.capgemini.core.ems.exceptions.EMSException;
import com.capgemini.core.ems.model.EmployeeDAO;
import com.capgemini.core.ems.model.EmployeeDAOImpl;

//loose coupling
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO empDAO;
	
	public EmployeeServiceImpl()
	{
		//association-{link}
		empDAO=new EmployeeDAOImpl();
	}
	
	
	@Override
	public int addEmployee(Employee employee) throws EMSException 
	{
		int empID=0;
	
		if(isValid(employee))
		{
			empID=empDAO.addEmployee(employee);
			System.out.println("empidService"+empID);
		}
			
		
		return empID;
	}

	@Override
	public Employee getEmployee(int id) throws EMSException
	{
		Employee employee=null;
		employee= empDAO.getEmployee(id);
		return employee;
	}

	@Override
	public void updateEmployee(Employee employee) throws EMSException
	{
		empDAO.updateEmployee(employee);
	}

	@Override
	public Employee removeEmployee(int id) throws EMSException
	{
		Employee employee= null;
		employee= empDAO.removeEmployee(id);
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() throws EMSException {
		List<Employee> employees=null;
		
		employees=empDAO.getAllEmployees();
		
		return employees;
	}

	@Override
	public boolean isValid(Employee employee) throws EMSException {
		// TODO Auto-generated method stub
		return true;
	}

}
