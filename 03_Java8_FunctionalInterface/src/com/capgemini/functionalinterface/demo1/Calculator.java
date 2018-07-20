package com.capgemini.functionalinterface.demo1;


@FunctionalInterface
public interface Calculator 
{
	public double operate(double num1, double num2);
	
	//an function interface can have default static methods as shown below
	//the annotation ensures that only one abstract method is allowed
	
	
	public default void printVersion()
	{
		System.out.println("Version 1.0");
	}
	
	public static String getVersion()
	{
		return  "Version 1.0";
	}
}
