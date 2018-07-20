package com.synergetics.lambda.demo5.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TestSorting 
{
	public static void main(String[] args) 
	{
		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
		
		//sort by age
		System.out.println("Sorting by age");
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
	
		for (Developer developer : listDevs) {
			System.out.println(developer);
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
