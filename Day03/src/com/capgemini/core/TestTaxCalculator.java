package com.capgemini.core;

import java.util.Arrays;

public class TestTaxCalculator {
	
	public static void main(String[] args) 
	{
		
		double employeeSalary = 0;
		
		double taxAmount = 0;
		
		
			try 
			{
				taxAmount = TaxCalculator.getTaxableAmountOnSalary( employeeSalary );
			}
			catch (ZeroSalaryException | NegativeSalaryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		System.out.println( taxAmount );
		
		
	}
}
