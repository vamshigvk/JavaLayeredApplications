package com.capgemini.core.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationDemo 
{
	public static void main(String[] args) 
	{
		Employee emp2 = null;
		
		try (ObjectInputStream ois = new ObjectInputStream( new FileInputStream("c:\\tmp\\emp.dat") ) ) 
		{
			emp2 = (Employee)ois.readObject();
			
			System.out.println("DeSerialization was Successful");
			
			System.out.println( emp2 );
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
