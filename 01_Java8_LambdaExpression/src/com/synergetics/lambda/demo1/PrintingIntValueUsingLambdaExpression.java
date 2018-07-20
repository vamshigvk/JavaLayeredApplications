package com.synergetics.lambda.demo1;

import java.util.Arrays;
import java.util.List;

public class PrintingIntValueUsingLambdaExpression 
{
	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(123, 345, 56, 35, 45, 35);
		
		//Lamdba expression returning an functional interface object.
		
		PrintIntValue printer = ( num ) -> System.out.println( num );
		
		for (int index = 0; index < numbers.size(); index++) 
		{
			printer.print( numbers.get( index ) );
		}
		
		/*	We got rid of annonymous class by using a lambda expression however still we are relying on the normal for-loop 
		 *  for collection traversing. 
		 *  
		 *  There are several limitations to this approach. One of them is that the above loop is inherently sequential, 
		 *  even though there is no fundamental reason it couldn't be executed by multiple threads.
		 *  
		 */
		
		//=======================================================================================
		
		/*
		 *  
		 *  Rewritten to use internal iteration with lambda expression the above code will be 
		*/
		
		numbers.forEach((Integer value) -> System.out.println(value));
		
		/*  Note here we are not using the functional interface we have created "PrintIntValue" rather what is being passed 
		 *  in a Consumer interface object which is one of the four types of internal functional interface. [Consumer, Supplier, Function, Predicate]
		 */ 
		
	}
}
