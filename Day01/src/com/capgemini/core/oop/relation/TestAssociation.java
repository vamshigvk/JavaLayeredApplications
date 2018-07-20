package com.capgemini.core.oop.relation;

public class TestAssociation 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee(1011, "Eric", 13_000);
		
		Address add = new Address("Sunshine apt", "Pune", "MH", "India", 342932);
		
		
		//make association
		//emp.setAddress( add );
		
		//proof
		
		System.out.println( emp.getId() );
		System.out.println( emp.getAddress().getPincode() );
		
		
		
		
		
	}
}
