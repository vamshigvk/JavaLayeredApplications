package com.synergetics.methodref.demo1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PersonAgeComparator implements Comparator<Person> {
	public int compare(Person a, Person b) {
		return a.getBirthday().compareTo(b.getBirthday());
	}
}

public class WithoutUsingMethodReference 
{
	public static void main(String[] args) 
	{
		//Getting a list of roster [simple put a collection of person objects]
		
		List<Person> roster = Person.createRoster();  

		//printing before sorting
		
		for (Person p : roster) {
			p.printPerson();
		}

		//Using collections.sort method which take the collection and comparator as the arguments
		
		// Without method reference
		Collections.sort(roster, new PersonAgeComparator());

		//Printing after sorting
		
		System.out.println("\nAfter Sorting");

		for (Person p : roster) {
			p.printPerson();
		}   
	}
}
