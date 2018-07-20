package com.capgemini.functionalinterface.demo1;

public class CalculatorOperator 
{
	public static double performOperation(double num1, double num2, Calculator calc)
	{
		return calc.operate(num1, num2);
	}
}
