package com.synergetics.lambda.demo1;

import java.util.Arrays;
import java.util.List;

public class PrintingIntValuesWithoutLambdaExpression 
{
	public static void main(String[] args) 
	{
		//not using lambda expression but annoymous class
		
		PrintIntValue printer = new PrintIntValue() {			
			@Override
			public void print(int value) {
				System.out.println( value );
			}
		};
		
		List<Integer> numbers = Arrays.asList(123, 345, 56, 35, 45, 35);
		
		for (int index = 0; index < args.length; index++) 
		{
			printer.print( numbers.get( index ) );
		}
	}
}
