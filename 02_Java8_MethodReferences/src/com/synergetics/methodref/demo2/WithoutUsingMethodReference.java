package com.synergetics.methodref.demo2;

import java.util.Collections;
import java.util.List;

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
		
		// Without method-reference
		//Using lambda expression we no longer have to define the class: PersonAgeComparator
		
		Collections.sort(roster, (Person a, Person b) -> {
            return a.getBirthday().compareTo(b.getBirthday());
        });

		//Printing after sorting
		
		System.out.println("\nAfter Sorting");

		for (Person p : roster) {
			p.printPerson();
		}   
	}
}
