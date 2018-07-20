package com.capgemini.streamsapi.demo2;

import java.util.Arrays;
import java.util.List;

public class UsingFilterMethod {
	public static void main(String[] args) {
		
		List<Employee> employees  = Arrays.asList(new Employee(1232, "John", 1200),
				new Employee(8743, "Eric", 1300),
				new Employee(9837, "John", 1100),
				new Employee(9384, "Alfred", 1300),
				new Employee(9384, "Britney", 1400),
				new Employee(1111, "Adam", 1200));
		
		employees.stream()
			.filter((e) -> e.getName().startsWith("A"))
			.filter((e) -> e.getSalary() > 1100).forEach(System.out::println);
		
	}
}
