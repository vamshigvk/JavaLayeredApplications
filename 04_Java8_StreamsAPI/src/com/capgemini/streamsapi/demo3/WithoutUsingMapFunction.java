package com.capgemini.streamsapi.demo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithoutUsingMapFunction {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(123, "John", "Manager", 23000),
				new Employee(234, "Eric", "Associate", 12000),
				new Employee(873, "Peter", "Executive", 13000),
				new Employee(983, "Adam", "TeamLead", 18000),
				new Employee(983, "Jane", "Manager", 22000),
				new Employee(983, "Arnold", "Manager", 34000));

		System.out.println("Managers Individual Salaries");

		List<Employee> managers = new ArrayList<Employee>();
		
		for (int index = 0; index < employees.size(); index++) {
			Employee emp = employees.get(index);
			
			if( emp.getDesignation().equalsIgnoreCase("Manager"))
				managers.add( employees.get(index));
		}
		
		for (int index = 0; index < managers.size(); index++) {
			Employee emp = managers.get(index);
			
			float salary = emp.getSalary();
			
			System.out.println( salary );
		}
		

		//Find total salary of all the Manager
		
		float totalManagersSalary = 0;
		
		for (int index = 0; index < managers.size(); index++) {
			Employee emp = managers.get(index);
			
			float salary = emp.getSalary();
			
			totalManagersSalary += salary;
		}
		
		System.out.println("Total Salary : " + totalManagersSalary );

	}

}
