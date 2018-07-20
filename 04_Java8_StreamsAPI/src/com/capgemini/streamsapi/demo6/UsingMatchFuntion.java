package com.capgemini.streamsapi.demo6;

import java.util.Arrays;
import java.util.List;

import com.capgemini.streamsapi.demo3.Employee;

public class UsingMatchFuntion 
{
	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
				new Employee(123, "John", "Manager", 23000),
				new Employee(234, "Eric", "Associate", 12000),
				new Employee(873, "Peter", "Executive", 13000),
				new Employee(983, "Adam", "TeamLead", 18000),
				new Employee(983, "Jane", "Manager", 22000),
				new Employee(983, "Arnold", "Manager", 34000));

		boolean result1 = employees.stream()
		.allMatch( (Employee e) -> e.getSalary() > 5000 );
		
		boolean result2 = employees.stream()
			.anyMatch( (Employee e) -> e.getDesignation().equalsIgnoreCase("Executive") );
		
		boolean result3 = employees.stream()
			.noneMatch( (Employee e) -> e.getDesignation().equalsIgnoreCase("Freelancer") );
		
		System.out.println("Do all employees have salary greater then 5000? Ans: " + result1);
		System.out.println("Do we have atleast one executive? Ans: " + result2);
		System.out.println("We do not have even one freelancer? Ans: "  +result3);
	}
}
