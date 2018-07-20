package com.synergetics.lambda.demo4;

import java.util.function.Consumer;

public class UsingLambdaExpression 
{
	/* if we  encapsulate this try/finally block in a static method of the Resource class and possibly to make its 
	 * constructor private in order to oblige the clients of that class to use it only through that method: 
	 */
	
	public static void withResource(Consumer<Resource> consumer) 
	{
	    Resource resource = new Resource();
	
	    try {
	        consumer.accept(resource);
	    } finally {
	        resource.dispose();
	    }
	}
	
	public static void main(String[] args) 
	{
		
		/* The argument passed to this method is an instance of the Consumer functional interface that allows to consume 
		 *  the resource or, in other words, to perform some actions on it. In this way we can operate on the resource by 
		 *  just passing a lambda expression to that method:
		 */
		
		withResource(resource -> resource.operate());
	}
}
