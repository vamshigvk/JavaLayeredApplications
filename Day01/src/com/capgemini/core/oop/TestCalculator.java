package com.capgemini.core.oop;

public class TestCalculator 
{
	public static void main(String[] args) 
	{
		//Calculator calc = new Calculator();
		
		int radius = 12;
		
//		double area = 3.14 * radius * radius;
		
		double radiusSquare =  Calculator.mul(radius, radius);
		
		double area = Calculator.mul(Math.PI, radiusSquare);
		
		System.out.println( Calculator.add(12, 12, 12));
	}
}
