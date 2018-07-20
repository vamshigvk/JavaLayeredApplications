package com.capgemini.functionalinterface.demo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionalInterfaceDemo 
{
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		for (int count = -10; count <= 10; count++) {
			numbers.add ( count );
		}
		
		//=================================================
		
		Predicate<Integer> allPositives = (i) -> i > 0;
		Predicate<Integer> allEvenNumbers = (i) -> i % 2 == 0;
		Predicate<Integer> allEvenNumbersGreaterThenFour = (i) -> i % 2 == 0  && i > 4;
		
//		System.out.println("Printing all positives");
//		printValues(numbers, allPositives);
		
//		System.out.println("printing all even numbers");
//		printValues(numbers, allEvenNumbers);
//		
		System.out.println("printing all even numbers greater than 4");
		printValues(numbers, allEvenNumbersGreaterThenFour);
	}
	
	public static void printValues(List<Integer> numbers, Predicate<Integer> predicate)
	{
		for (Integer number : numbers) {
			if(predicate.test( number ))
				System.out.println( number );
		}
	}
}
