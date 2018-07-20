package com.capgemini.hrd.model;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.hrd.beans.Employee;
import com.capgemini.hrd.exceptions.HRDExceptions;

public class EmployeeDAOImpl implements EmployeeDAO
{
	Map<Integer,Employee>employees=new HashMap<>();
	{
		Employee employee1= new Employee(1011,"jhon", "security", 6000400);
		Employee employee2= new Employee(3433,"eric","acconts",400500);
		Employee employee3= new Employee(8734,"peter","accounts",500500);
		Employee employee4= new Employee(8732,"anna","R&D",850300);
		Employee employee5= new Employee(8734,"janw","security",445000);
		
		employees.put(employee1.getEmpId() ,employee1);
		employees.put(employee2.getEmpId() ,employee2);
		employees.put(employee3.getEmpId() ,employee3);
		employees.put(employee4.getEmpId() ,employee4);
		employees.put(employee5.getEmpId() ,employee5);
		
	}
	@Override
	public Employee getEmployeeDetails(int empId)throws HRDExceptions
	{
		Employee employee=employees.get(empId);
		if(employee==null)
			throw new HRDExceptions("Employee not found with empId"+empId);
		return employee;
	}

	@Override
	public double calculateEmployeeSalary(int empId, int days)throws HRDExceptions
	{
		Employee employee= employees.get(empId);
		
		double CurrentMonthSalary=employee.getSalary()*days/12/30;
		
		return CurrentMonthSalary;
	}

}
