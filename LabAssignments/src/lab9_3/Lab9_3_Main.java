package lab9_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	String name;
	int id;
	float salary;
	String designation;
	public Employee(String name, int id, float salary, String designation) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.designation = designation;
	}
	
	public void showDetails()
	{
		System.out.println("Employee id:"+ id);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
		System.out.println("Employee Designation"+ designation);

	}
}


public class Lab9_3_Main  implements Serializable
{
	void writeData()
	{
		Employee db[]= {new Employee("Vamshi", 111 , 12000.60f, "Analyst"),
						new Employee("Krishna", 112 , 13000.60f, "A4")};
		try(FileOutputStream out = new FileOutputStream("C:\\temp\\temp1\\hello.txt");
				ObjectOutputStream sout = new ObjectOutputStream(out);)
		{
			for (int i = 0; i < db.length; i++) {
				sout.writeObject(db[i]);
			}
		}
		catch(IOException e)
		{
			System.out.println("IOException bro"+e);
		}
	}
	void readData()
	{
		try(FileInputStream in = new FileInputStream("C:\\temp\\temp1\\hello.txt");
				ObjectInputStream sin = new ObjectInputStream(in);)
		{
			Employee e = (Employee)sin.readObject();
			e.showDetails();
			e = (Employee)sin.readObject();
			e.showDetails();
			e = (Employee)sin.readObject();
			e.showDetails();
			sin.close();
		}
		catch(IOException ioe)
		{
			System.out.println("mistake"+ ioe);
		}
		catch(ClassNotFoundException cnfe)
		{
			System.out.println("mistkae1"+ cnfe);
		}
	}
	
	public static void main(String[] args)
	{
		Lab9_3_Main o= new Lab9_3_Main();
		o.writeData();
		o.readData();
	}
}
