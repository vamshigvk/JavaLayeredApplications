package com.capgemini.core.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;


class Address 
{
	private int pincode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int pincode) {
		super();
		this.pincode = pincode;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + "]";
	};
}

//JavaBean
class Employee implements Serializable
{
	
	private int id;
	private String name;
	private float salary;
	private Date dateOfJoining;
	private transient Address address = new Address(400101);
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, float salary, Date dateOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dateOfJoining=" + dateOfJoining
				+ "]";
	}
}



//Serialization: A process of writing an Object to a Stream
public class SerializationDemo 
{
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee(1011, "Peter", 12000, new Date());
		
		try( ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("c:\\tmp\\emp.dat") ) ) 
		{
			oos.writeObject( emp1 );
			
			System.out.println("Serialization was successful");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}


















