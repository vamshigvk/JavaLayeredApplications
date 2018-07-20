package com.capgemini.core.oop.relation;

public class Employee 
{
	private int id;
	private String name;
	private double salary;
	
	private Address address;
	
	
	public Employee() {
	}


	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Address getAddress() {
		return address;
	}

	//make association
	public void setAddress(Address address) {
		this.address = address;
	}


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

		
}
