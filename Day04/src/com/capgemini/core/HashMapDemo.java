package com.capgemini.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, Employee> employees = new HashMap<>();
		
		employees.put( 101 , new Employee(101, "John", 23_000));
		employees.put( 342 , new Employee(342, "Eric", 25_000));
		employees.put( 833 , new Employee(833, "Peter", 22_000));
		employees.put( 332 , new Employee(332, "Sam", 21_000));
		
		Set entries = employees.entrySet();
				
		Iterator it = entries.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		// accessing all values
		
		System.out.println();
	
		Collection values = employees.values();
		
		it = values.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		//accessing all keys
		
		System.out.println();
		
		Set keys = employees.keySet();
		
		it = keys.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		

	}
}















