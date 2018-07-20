package com.capgemini.core.oop;

public class TestEmployee 
{
	public static void main(String[] args) 
	{
		Employee.setCompany("Capgemini");
		
		//Declaration
		Employee emp1 = null;
		
		//Instantiation
		emp1 = new Employee();// 101, "Eric", 23_000 );
		
		emp1.printDetails();
		
		emp1 = null;
		
		for (int i = 0; i < 10_00_000; i++) {
			new Employee();
		}
		
		
		
		//Initialization
		
//		emp1.id = 101;
//		emp1.setCompany("Capgemini");
//		emp1.setId( 101 );
//		emp1.setName( "John" );
//		emp1.setSalary( 23_000 );
		
		
		
//		System.out.println( emp1.getCompany() );
	}
}
