package com.capgemini.core.oop;

public class Employee 
{	

	//Instance Variables // Member Variables

	private int id;
	private String name;
	private double salary;	
	
	//init block
	{
		//System.out.println("Constructor called");
		
		id = -1;
		salary = -1;
		name = "Unknown";		
	}
	
	static
	{
		
	}
	
	public Employee() 
	{

	}
	
	public Employee(int id) {
		this.id = id;
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	//Constructor Overloading
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	private static String company;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Employee.company = company;
	}

	public void printDetails()
	{
		System.out.println( id );
		System.out.println( name );
		System.out.println( salary ); 
	}
	
	@Override
	protected void finalize() throws Throwable 
	{
		System.out.println("finalize called");
		id = 0;
		salary = 0;
		name = null;
	}
	
}
