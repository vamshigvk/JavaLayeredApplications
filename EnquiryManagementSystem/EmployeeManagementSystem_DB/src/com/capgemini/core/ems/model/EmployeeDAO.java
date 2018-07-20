package com.capgemini.core.ems.model;


import java.util.*;
import com.capgemini.core.ems.beans.Employee;
import com.capgemini.core.ems.exceptions.EMSException;

public interface EmployeeDAO {
	//DAO is data access object
	public int addEmployee(Employee employee) throws EMSException;

	public Employee getEmployee(int id) throws EMSException;

	public void updateEmployee(Employee employee)throws EMSException;

	public Employee removeEmployee(int id)throws EMSException ;

	public List<Employee> getAllEmployees() throws EMSException;






}
