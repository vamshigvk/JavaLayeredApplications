package com.synergetics.lambda.demo5.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortByName implements Comparator<Developer>
{	
	@Override
	public int compare(Developer o1, Developer o2) 
	{
		return o1.getName().compareTo(o2.getName());
	}
}

class SortBySalary implements Comparator<Developer>
{
	@Override
	public int compare(Developer o1, Developer o2) 
	{
		return (int)(o1.getSalary() - o2.getSalary());
	}
}

public class TestSorting 
{
	public static void main(String[] args) 
	{
		List<Developer> listDevs = getDevelopers();
		
		Collections.sort( listDevs, new SortByName());
		
		System.out.println("After sorting by Name");
		
		for (Developer developer : listDevs) {
			System.out.println( developer ); 
		}
		
		
		
		Collections.sort( listDevs, new SortBySalary());
		
		System.out.println("After Sorting by Salary");
		
		for (Developer developer : listDevs) {
			System.out.println( developer ); 
		}
	}
	
	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", 70000	, 33));
		result.add(new Developer("alvin", 80000, 20));
		result.add(new Developer("jason", 100000, 10));
		result.add(new Developer("iris", 170000, 55));
		
		return result;

	}
}
