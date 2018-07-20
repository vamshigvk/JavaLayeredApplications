package com.capgemini.streamsapi.demo6;

import java.util.Arrays;
import java.util.List;

import com.capgemini.streamsapi.demo3.Employee;

public class WithoutUsingMatchFunction 
{
	public static void main(String[] args) 
	{
		List<Employee> employees = Arrays.asList(
				new Employee(123, "John", "Manager", 23000),
				new Employee(234, "Eric", "Associate", 12000),
				new Employee(873, "Peter", "Executive", 13000),
				new Employee(983, "Adam", "TeamLead", 18000),
				new Employee(983, "Jane", "Manager", 22000),
				new Employee(983, "Arnold", "Manager", 34000));
		
		
		//check if all employees have salary greater than 5000
		
		boolean isAllSalaryGreaterThan5000 = true;
		
		for (int index = 0; index < employees.size(); index++) {
			
			Employee emp = employees.get(index);
			
			if(emp.getSalary() <= 5000)
			{
				isAllSalaryGreaterThan5000 = false; 
				break;
			}			
		}
		
		boolean isAtleastOneExecutivePresent = false;
		
		for (int index = 0; index < employees.size(); index++) {
			
			Employee emp = employees.get(index);
			
			if(emp.getDesignation().equalsIgnoreCase("Executive"))
			{
				isAtleastOneExecutivePresent = true; 
				break;
			}			
		}
		
		
		boolean isAtleastOneFreelancerPresent = false;
		
		for (int index = 0; index < employees.size(); index++) {
			
			Employee emp = employees.get(index);
			
			if(emp.getDesignation().equalsIgnoreCase("Freelancer"))
			{
				isAtleastOneFreelancerPresent = true; 
				break;
			}			
		}
		
		System.out.println("Do all employees have salary greater then 5000? Ans: " + isAllSalaryGreaterThan5000);
		System.out.println("Do we have atleast one executive? Ans: " + isAtleastOneExecutivePresent);
		System.out.println("We do not have even one freelancer? Ans: "  +isAtleastOneFreelancerPresent);
	}
}
