package com.capgemini.core.ems.model;

import java.util.List;

import com.capgemini.core.ems.beans.Employee;
import com.capgemini.core.ems.exceptions.EMSException;
import com.capgemini.core.ems.util.DBUtil;

public class EmployeeDAOImpl implements EmployeeDAO
{

	private List<Employee> employees;
	private DBUtil dbUtil= new DBUtil();

	//to remember previously sassigned emp id
	private int employeeID=1000;

	public EmployeeDAOImpl() 
	{
		employees=dbUtil.getEmployees();

	}

	public int generateEmployeeId() 
	{
		return ++employeeID;
	}

	@Override
	public int addEmployee(Employee employee) throws EMSException
	{	

		int empId=generateEmployeeId();

		employee.setId(empId);

		employees.add(employee);

		return empId;
	}

	@Override
	public Employee getEmployee(int id) throws EMSException 
	{
		
		int index= employees.indexOf(new Employee(id));
		if(index==-1)
		{
			throw new EMSException("Employee not found with id"+id);
		}
		
		return employees.get(index); 
	}

	@Override
	public void updateEmployee(Employee employee) throws EMSException {
		int index= employees.indexOf(employee);
		if(index==-1)
		{
			throw new EMSException("Employee not found with id"+employee.getId());
		}
		//employee found
		//updating details
		Employee oldEmployee = employees.get(index);
		
		oldEmployee.setName(employee.getName());
		oldEmployee.setSalary(employee.getSalary());
		oldEmployee.setDepartment(employee.getDepartment());
		oldEmployee.setDateOfJoining(employee.getDateOfBirth());
		oldEmployee.setDateOfJoining(employee.getDateOfJoining());
		
		//updating successful
	}

	@Override
	public Employee removeEmployee(int id) throws EMSException {
		
		
		int index= employees.indexOf(new Employee(id));
		if(index==-1)
		{
			throw new EMSException("Employee not found with id"+id);
		}
		return  employees.remove(index);
	}

	@Override
	public List<Employee> getAllEmployees() throws EMSException {
		return employees;
	}

}
