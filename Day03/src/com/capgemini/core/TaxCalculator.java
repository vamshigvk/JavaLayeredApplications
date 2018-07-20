package com.capgemini.core;

public class TaxCalculator 
{
	public static double getTaxableAmountOnSalary( double salary ) throws ZeroSalaryException, NegativeSalaryException
	{
		if( salary == 0)
			throw new ZeroSalaryException();

		if( salary < 0)
			throw new NegativeSalaryException("Negative salary not possible");
		
		double taxableAmount = salary * 0.07;
		
		return taxableAmount;
	}
}
