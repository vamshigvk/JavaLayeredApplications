package com.capgemini.functionalinterface.demo2;

public class UsingRunnableAsAFunctionalInterface 
{
	public static void main(String[] args) {
		
		//Here unseen is that the lambda expression returns object of the functional interface Runnable
		
		Thread t1 = new Thread( () -> System.out.println("Hello World") );
		
		t1.start();
		
	}
}
