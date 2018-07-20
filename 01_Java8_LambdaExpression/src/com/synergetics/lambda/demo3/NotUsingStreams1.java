package com.synergetics.lambda.demo3;

import java.util.Arrays;
import java.util.List;

public class NotUsingStreams1 
{
	public static void main(String[] args) 
	{
		// Problem statement: take only the even numbers in the list, double them and 
		// finally print the first one bigger than 5
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		for (int number : numbers) {
		    if (number % 2 == 0) {
		        int n2 = number * 2;
		        if (n2 > 5) {
		            System.out.println(n2);
		            break;
		        }
		    }
		}
		
		/* What is wrong with this solution should be clear: it does too much in a single, 
		 *  deeply nested and then difficult to read and maintain block of code.
		 *  
		 *  So see check NotUsingStream2.java
		 */
	}
}
