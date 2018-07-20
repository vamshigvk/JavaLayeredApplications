package com.capgemini.streamsapi.demo3;

import java.util.Arrays;
import java.util.List;

public class UsingMapFunction {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
				new Employee(123, "John", "Manager", 23000),
				new Employee(234, "Eric", "Associate", 12000),
				new Employee(873, "Peter", "Executive", 13000),
				new Employee(983, "Adam", "TeamLead", 18000),
				new Employee(983, "Jane", "Manager", 22000),
				new Employee(983, "Arnold", "Manager", 34000));

		System.out.println("Managers Individual Salaries");
		
		employees.stream()
		.filter((Employee e) -> e.getDesignation().equalsIgnoreCase("Manager"))
		.map(Employee::getSalary)
		.forEach(System.out::println);

		//Find total salary of all the Manager
		
		double totalSalary = employees.stream()
				.filter((Employee e) -> e.getDesignation().equalsIgnoreCase("Manager"))
				.mapToDouble(Employee::getSalary)
				.sum();
		
		System.out.println("Total salary of Managers : " + totalSalary);
		

	}
}
