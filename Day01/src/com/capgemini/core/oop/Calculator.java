package com.capgemini.core.oop;

public class Calculator 
{
	public static double add( double num1, double num2) {
		return  num1 + num2;
	}
	
	public static double add( double num1, double num2, double num3) {
		return  num1 + num2 + num3;
	}
	
	public static double add( double ... nums)
	{
		double total = 0;
		
		for (double num : nums) {
			total += num;
		}
		
		return total;
	}
	
	public static double sub( double num1, double num2) {
		return num1 - num2;
	}
	
	public static double mul( double num1, double num2) {
		return num1 * num2;
	}
	
	public static double div( double num1, double num2) {
		return num1 / num2;
	}
}
