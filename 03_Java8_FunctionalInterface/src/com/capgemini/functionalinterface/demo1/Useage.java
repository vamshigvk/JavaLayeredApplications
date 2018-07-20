package com.capgemini.functionalinterface.demo1;

import java.util.Scanner;

public class Useage 
{
	public static void main(String[] args) 
	{
		Calculator add = (num1, num2) -> num1 + num2;
		Calculator sub = (num1, num2) -> num1 - num2;
		Calculator mul = (num1, num2) -> num1 * num2;
		Calculator div = (num1, num2) -> num1 / num2;
		
		System.out.println("Welcome to my Calculator app version "  +Calculator.getVersion());
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter first number");
		double num1 = console.nextDouble();
		
		System.out.println("Enter Second number");
		double num2 = console.nextDouble();
		
		System.out.println("Enter operation of choice");
		System.out.println("1: Addition");
		System.out.println("2: Substraction");
		System.out.println("3: Multiplication");
		System.out.println("4: Division");
		
		System.out.println("Enter your choice");
		int choice = console.nextInt();
		
		switch (choice) 
		{
		case 1:
			System.out.println( CalculatorOperator.performOperation(num1, num2, add) );	
		break;

		case 2:
			System.out.println( CalculatorOperator.performOperation(num1, num2, sub) );	
		break;
		
		case 3:
			System.out.println( CalculatorOperator.performOperation(num1, num2, mul) );	
		break;
		
		case 4:
			System.out.println( CalculatorOperator.performOperation(num1, num2, div) );	
		break;		
		
		default: System.out.println("invalid choce");
		}
	}
}
