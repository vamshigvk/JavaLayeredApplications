package com.synergetics.lambda.demo2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SummationUsingLambdaExpression 
{
	public static int sumAll(List<Integer> numbers, Predicate <Integer> p)
	{
		int total = 0;
		
		for (int index = 0; index < numbers.size(); index++) 
		{
			if( p.test( numbers.get( index )))
			{
				total += numbers.get( index );
			}
		}
		
		return total;
	}	
	
	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		
		int result1 = sumAll(numbers, n -> true);			
		int	result2 = sumAll(numbers, n -> n % 2 == 0);
		int	result3 = sumAll(numbers, n -> n > 3);
		
		System.out.println("Summation of all numbers: " + result1);
		System.out.println("Summation of all even numbers: " + result2);
		System.out.println("Summation of all numbers greater than 3: " + result3);
	}
}
