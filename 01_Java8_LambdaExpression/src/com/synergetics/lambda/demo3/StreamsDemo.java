package com.synergetics.lambda.demo3;

import java.util.Arrays;
import java.util.List;

/*  Coming from NotUsingStream2.java, here using a Stream we can solve the 
 *  former problem with a single fluent statement: 
 */

public class StreamsDemo 
{
	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		System.out.println(
			    numbers.stream()
			            .filter(Lazy::isEven)
			            .map(Lazy::doubleIt)
			            .filter(Lazy::isGreaterThan5)
			            .findFirst()
			);
	}
	
	/* NOTE: 
	 * 
	 * 1) The methods isEven, doubleIt and isGreaterThan5 are static methods in the class Lazy and are accessed using
	*  method reference ( lazy"::"isEven )
	*  
	*  2) The terminal method findFirst() returns an Optional Object
	*/ 
	
	
}
