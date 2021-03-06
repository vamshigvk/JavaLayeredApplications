package com.synergetics.methodref.demo3;

import java.util.Collections;
import java.util.List;

public class UsingMethodReference 
{
	public static void main(String[] args) 
	{
		//Getting a list of roster [simple put a collection of person objects]
		
		List<Person> roster = Person.createRoster();  

		//printing before sorting
		
		for (Person p : roster) {
			p.printPerson();
		}
		
		//Consider the situation where the person class already has the method compareByAge which has the definition
		//of comparison by age so instead of writing a lambda expression which provides the logic for comparison here
		//lambda expression can be used to call the static method compareByAge defined in the Person class instead
		
		Collections.sort(roster, (a, b) -> Person.compareByAge(a, b));

		//Here if we see the above statement the lambda expression is doing nothing but invoking the compareByAge method
		//Rather than using lambda expression to invoke the method we can go for method - reference 
		//which is a replacement for the call placed by lambda expression explicitly.
		
		Collections.sort(roster, Person::compareByAge);
		
		//Printing after sorting
		
		System.out.println("\nAfter Sorting");

		for (Person p : roster) {
			p.printPerson();
		}   
	}
}
