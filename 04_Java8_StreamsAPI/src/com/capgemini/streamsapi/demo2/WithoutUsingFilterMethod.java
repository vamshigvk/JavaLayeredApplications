package com.capgemini.streamsapi.demo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithoutUsingFilterMethod 
{
	public static void main(String[] args) 
	{
		
		List<Employee> employees  = Arrays.asList(new Employee(1232, "John", 1200),
				new Employee(8743, "Eric", 1300),
				new Employee(9837, "John", 1100),
				new Employee(9384, "Alfred", 1300),
				new Employee(9384, "Britney", 1400),
				new Employee(1111, "Adam", 1200));
		
		List<Employee> employeesSortedByName = new ArrayList<Employee>();
		
		for (int index = 0; index < employees.size(); index++) {
			
			Employee emp = employees.get(index);
			
			if(emp.getName().startsWith("A"))
			{
				employeesSortedByName.add(employees.get(index));
			}
		}
		
		
		List<Employee> employeesSortedBySalary = new ArrayList<>();
		
		for (int index = 0; index < employeesSortedByName.size(); index++) {
			
			Employee emp = employeesSortedByName.get(index);
			
			if( emp.getSalary() > 1100 )
			{
				employeesSortedBySalary.add(employeesSortedByName.get(index));
			}
		}
		
		for (int index = 0; index < employeesSortedBySalary.size(); index++) {
			System.out.println( employeesSortedBySalary.get(index));
		}
	}
}











