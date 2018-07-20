package com.capgemini.core.ems.view;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import com.capgemini.core.ems.beans.Employee;
import com.capgemini.core.ems.exceptions.EMSException;
import com.capgemini.core.ems.model.EmployeeDAO;
import com.capgemini.core.ems.model.EmployeeDAOImpl;
import com.capgemini.core.ems.service.EmployeeService;
import com.capgemini.core.ems.service.EmployeeServiceImpl;

public class Client 
{
	//loose coupling due to the use of interface reference
	private EmployeeService employeeService;
	
	public Client()
	{
		//association - linking to service
				employeeService= new EmployeeServiceImpl();
	}
	
	public void menu()
	{
	
		System.out.println("1. Add Employee Information");
		System.out.println("2. Get Employee Information");
		System.out.println("3. Update Employee Information");
		System.out.println("4. Remove Employee Information");
		System.out.println("5. View all Employee Information ");
		System.out.println("0. Exit Application");
		
		Scanner console=new Scanner(System.in);
		System.out.println("Please select an option");
		int choice= console.nextInt();
		
		switch (choice) {
		case 1:	
			
			
			
			System.out.println("1. Enter Employee Name:");
			String name=console.next();
			
			System.out.println("2. Enter Employee Salary:");
			double salary=console.nextDouble();
			
			System.out.println("3. Enter Employee department");
			String department=console.next();
			
			System.out.println("4. Enter Employee dateOfBirth(dd-MM-yyyy)");
			String dateOfBirthStr=console.next();
			
			System.out.println("5. Enter Employee dateOfJoining");
			String dateOfJoiningStr=console.next();
			
			Employee employee=new Employee();
			
			employee.setName(name);
			employee.setSalary(salary);
			employee.setDepartment(department);
			employee.setDateOfBirth(convertToDate(dateOfBirthStr));
			employee.setDateOfBirth(convertToDate(dateOfJoiningStr));
			
			try 
			{
			int empID=	employeeService.addEmployee(employee);
			System.out.println("Employee added Successfully"+empID);
			}
			catch (EMSException e) {
				
				e.printStackTrace();
			}
		break;

		case 2:
				System.out.println("Enter Employee ID to view Details");
				int empId= console.nextInt();
				
			try {
				employee =employeeService.getEmployee(empId);
				
				System.out.println("ID:"+ employee.getId());
				System.out.println("Name:"+ employee.getName());
				System.out.println("Salary:" + employee.getSalary());
				System.out.println("Department:"+ employee.getDepartment());
				System.out.println("Date of Birth: " + employee.getDateOfBirth());
				System.out.println("Date of Joining:" + employee.getDateOfJoining());
				
			}
			catch (EMSException e1) 
			{
				
				e1.printStackTrace();
			}
				
				
				
		break;
		
		case 3:	
				
			//get employee details if exists
			//update this employee
			System.out.println("Enter Employee ID to Update Details");
			 empId= console.nextInt();
			
		try {
			employee =employeeService.getEmployee(empId);
			
			//Updating name
			System.out.println("Employee Name:"+ employee.getName());
			System.out.println("Do you want to update the name? (Yes/No)");
			
			String reply= console.next();
			
			if(reply.equalsIgnoreCase("yes"))
			{
				System.out.println("Enter New Name:");
				employee.setName(console.next());
			}
			
			
			//updating salary
			System.out.println("Employee Salary"+ employee.getSalary());
			System.out.println("Do you want to update salary? (Yes/No)");
			
			reply= console.next();
			
			if(reply.equalsIgnoreCase("yes"))
			{
				System.out.println("Enter New Salary:");
				employee.setSalary(console.nextDouble());
			}
			
			
			//updating department
			System.out.println("Employee Department"+ employee.getSalary());
			System.out.println("Do you want to update Department? (Yes/No)");
			
			reply= console.next();
			
			if(reply.equalsIgnoreCase("yes"))
			{
				System.out.println("Enter New Department:");
				employee.setDepartment(console.next());
			}
			
			
			//updating Date of Birth
			System.out.println("Employee Date of Birth"+ employee.getDateOfBirth());
			System.out.println("Do you want to update Date of Birth? (Yes/No)");
			
			reply= console.next();
			
			if(reply.equalsIgnoreCase("yes"))
			{
				System.out.println("Enter New Date of Birth:");
				employee.setDateOfBirth(convertToDate(console.next()));
			}
			
			
			//Updating Date of Joining
			System.out.println("Employee Date of Joining"+ employee.getDateOfJoining());
			System.out.println("Do you want to update Date of Joining? (Yes/No)");
			
			reply= console.next();
			
			if(reply.equalsIgnoreCase("yes"))
			{
				System.out.println("Enter New Date of Joining:");
				employee.setDateOfJoining(convertToDate(console.next()));
			}
			
			employeeService.updateEmployee(employee);
			
			System.out.println("Employee details updated successfully");
			
			
						
		}
		catch (EMSException e1) 
		{
			
			e1.printStackTrace();
		}
			
				
			
		break;

		case 4:
			System.out.println("Enter Employee ID to Delete Employee Details");
			empId= console.nextInt();
			
		try 
		{
			employee =employeeService.removeEmployee(empId);
			
			System.out.println("Employee with below details is removed:");
			System.out.println("ID:"+ employee.getId());
			System.out.println("Name:"+ employee.getName());
			System.out.println("Salary:" + employee.getSalary());
			System.out.println("Department:"+ employee.getDepartment());
			System.out.println("Date of Birth: " + employee.getDateOfBirth());
			System.out.println("Date of Joining:" + employee.getDateOfJoining());
			
		}
		catch (EMSException e1) 
		{
			
			e1.printStackTrace();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
			
		
		break;
		
		case 5:	
			
			try 
			{
				List<Employee> employees=employeeService.getAllEmployees();
				
				Iterator<Employee> it= employees.iterator();
				
				System.out.println("ID \tName \tSalary \tDepartment \tDOB \tDOJ");
				
				while (it.hasNext()) 
				{
					Employee emp=it.next();
					
					System.out.println( emp.getId() + "\t" +
										emp.getName() + "\t"+
										emp.getDepartment() + "\t"+
										emp.getSalary() + "\t"+
										emp.getName() + "\t"+
										emp.getDateOfBirth() + "\t"+
										emp.getDateOfJoining() + "\t");
					
				}
				
			}
			catch (EMSException e) 
			{
			
				e.printStackTrace();
			}
			
			
		break;

		case 0:
			System.out.println("Thank you !! Good Bye!!");
			System.exit(0);
		break;
		
		default:
			System.out.println("Please choose a valid option");
		break;
		}
		
	}
	
	public Date convertToDate(String dateInString)
	{	
		
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate localDate= LocalDate.parse(dateInString, formatter);
		
		java.util.Date date= java.sql.Date.valueOf(localDate);
		
		return date;
		
		
	}
	
	public static void main(String[] args) 
	{
		
		//makes sure application runs forever unless you close it
		Client client=new Client();
		while(true)
		{
			client.menu();
		}
		
	}
	
}
