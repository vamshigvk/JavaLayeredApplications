package com.cg.eis.exception;
//lab assignment 5-1
public class EmployeeException extends Exception
{
	public EmployeeException(String s)
	{
		super(s);
		
	}
	public String toString()
	{
		return "Salary is below 3000";
	}
}
