package com.cg.eis.pl;
//lab assignment 5-1
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.EmployeeServices;
import com.cg.eis.service.EmployeeServicesImpl;

public class TestEmployeeDetails 
{
	 void menu()
	{
		System.out.println("1. Add Employee details");
		System.out.println("2. Find Employee details by entering Scheme ");
		System.out.println("3. Delete an employee");
		System.out.println("4. Sort employee details based on salary");
		
		EmployeeServices employeeServices = new EmployeeServicesImpl();
		Scanner console = new Scanner(System.in);
		int choice= console.nextInt(); 
		switch (choice)
		{
		case 1:
				Employee emp=new Employee();

			break;

		case 2:
			
			break;

		case 3:
			
			break;

		case 4:
			
			break;

		default: System.out.println("Wrong input");
			break;
		}
	}
	

	public static void main(String[] args)
	{
		
		
Employee emp1=new Employee(141, "VAmsh", 19000, "System Associate");
Employee emp2=new Employee(142,"Karthik",30000,"Programmer");
Employee emp3=new Employee(109, "Karunesh",50000,"Manager");
Employee emp4=new Employee(100,"john",1900,"Clerk");

ValidateSalary vs=new ValidateSalary();


try 
{
	vs.salaryValidation(emp1.getSalary());
	vs.salaryValidation(emp2.getSalary());
	vs.salaryValidation(emp3.getSalary());
	vs.salaryValidation(emp4.getSalary());
	
} 
catch (Exception e) {
	System.out.println("Salary is found to be below 3000:"+e);
}

EmployeeServices e1=new EmployeeServicesImpl();

e1.servicesEligibility(emp1);
e1.servicesEligibility(emp2);
e1.servicesEligibility(emp3);

	
	
	TestEmployeeDetails test = new TestEmployeeDetails();
	while(true)
	{
		test.menu();
	}


}

}
