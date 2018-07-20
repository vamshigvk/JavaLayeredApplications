package com.synergetics.lambda.demo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NotUsingStreams2 
{
	public static boolean isEven(int number) {
	    return number % 2 == 0;
	}

	public static int doubleIt(int number) {
	    return number * 2;
	}

	public static boolean isGreaterThan5(int number) {
	    return number > 5;
	}
	
	public static void main(String[] args) 
	{
		/*
		 *  To fix this problem we can split the 3 operations performed by that code in 
		 *  3 one-line methods each having a single well defined responsibility: as given above
		 * 
		 */
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		List<Integer> l1 = new ArrayList<Integer>();
		
		for (int n : numbers) 
		{
		    if (isEven(n)) 
		    	l1.add(n);
		}

		List<Integer> l2 = new ArrayList<Integer>();
		
		for (int n : l1) 
		{
		    l2.add(doubleIt(n));
		}

		List<Integer> l3 = new ArrayList<Integer>();
		
		for (int n : l2) 
		{
		    if (isGreaterThan5(n)) 
		    	l3.add(n);
		}

		System.out.println(l3.get(0));
		
		/*
		 *  Note: We have created a pipeline of list transformations where each stage uses one of the 
		 *  3 methods operating on the single numbers.		 * 
		 */
	}
}
