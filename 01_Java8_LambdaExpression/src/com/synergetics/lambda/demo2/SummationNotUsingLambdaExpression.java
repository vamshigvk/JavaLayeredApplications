package com.synergetics.lambda.demo2;

import java.util.Arrays;
import java.util.List;

public class SummationNotUsingLambdaExpression 
{
	public static int sumAll(List<Integer> numbers)
	{
		int total = 0;
		
		for (Integer number : numbers) {
			total += number;
		}
		
		return total;
	}
	
	//copy pasting earlier method and making changes
	public static int sumAllEven(List<Integer> numbers)
	{
		int total = 0;
		
		for (Integer number : numbers) {
			
			if( number % 2 == 0)			
				total += number;
		}
		
		return total;
	}
	
	//copy pasting earlier method and making changes
	public static int sumAllGreaterThanThree(List<Integer> numbers)
	{
		int total = 0;
		
		for (Integer number : numbers) {
			
			if( number > 3)			
				total += number;
		}
		
		return total;
	}
	
	
	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		
		//requirement 1 summation of all numbers
		int result = sumAll( numbers );
		
		System.out.println("Summation of all numbers: " + result);
		
		//requirement 2 summation of all even numbers
		
		result = sumAllEven( numbers );
		
		System.out.println("Summation of all even numbers: " + result);
		
		//requirement 3 summation of all numbers greater then 3
		
		result = sumAllGreaterThanThree( numbers );
	
		
		System.out.println("Summation of all numbers greater than 3: " + result);
	}	
}
