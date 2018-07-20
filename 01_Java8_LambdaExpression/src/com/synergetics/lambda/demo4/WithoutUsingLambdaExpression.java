package com.synergetics.lambda.demo4;

public class WithoutUsingLambdaExpression 
{
	public static void main(String[] args) 
	{
		//Then issue with the code below is what if an exception occurs while opening the resource?
		
		Resource resource = new Resource();
		resource.operate();
		resource.dispose();
		
		//So we better write it as
		
		resource = new Resource();
		
		try 
		{
		    resource.operate();
		} 
		finally 
		{
		    resource.dispose();
		}
		
		/*  The problem here is that we will have to repeat this try/finally block again and again every 
		 *  time we use the Resource (something that clearly violates the DRY(Don't repeat yourself) principle) and in case we 
		 *  will forget it in some point of our code we will run the risk of having a leak.
		 */
	}
}
