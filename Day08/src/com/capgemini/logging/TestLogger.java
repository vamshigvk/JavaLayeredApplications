package com.capgemini.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

class Calculator
{
	static Logger myLogger = Logger.getLogger(Calculator.class);
	
	public int divide(int num1, int num2)
	{
		myLogger.info("divide method called");
		myLogger.debug("div method called with arg " + num1 + "," + num2);
		
		if( num2 == 0 )
		{
			myLogger.error("Exception raised as second argument is " + num2);
			throw new IllegalArgumentException();
		}
		
		myLogger.warn("Attempting to div num1 by num2");
		int result = num1 / num2;
		
		return result;		
	}
}

public class TestLogger 
{
	public static void main(String[] args) 
	{
		PropertyConfigurator.configure("log4j.properties");
		
		int result = new Calculator().divide(12,  0);
		
		System.out.println("Result : " + result);
	}
}
