package com.cg.eis.pl;
//lab assignment 5-1
import com.cg.eis.exception.EmployeeException;

public class ValidateSalary {
	static void salaryValidation(double salary)  throws Exception
	{
		if(salary<3000)
		{
			
			throw new EmployeeException("Salary is below 3000 Exception");
		}
	}
}
