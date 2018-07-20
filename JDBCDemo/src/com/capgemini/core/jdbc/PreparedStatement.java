package com.capgemini.core.jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class PreparedStatement 
{
	public void readDataFromDatabase()
	{
		try(Connection con=DBUtil.getConnection())
		{
			java.sql.Statement stm= con.createStatement();
			ResultSet res = stm.executeQuery("Select * from student_marks");
			
			while(res.next())
			{
				int studentCode = res.getInt("student_code");
				int studentYear = res.getInt(2);
				int subject1    = res.getInt("subject1");
				
				System.out.println(studentCode+"\t\t"+ studentYear +"\t\t"+subject1);
			}
			
		}
		catch(ClassNotFoundException|SQLException e)
		{
			e.printStackTrace();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	
	}
	
	public void insertDateIntoDatebase()
	{
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter Department name:");
		String departmentName = console.next();
		
		System.out.println("Enter Department code:");
		int departmentCode = console.nextInt();
		
		try(Connection con=DBUtil.getConnection())
		{
			//java.sql.Statement stm = con.createStatement();
			//stm.execute("insert into department_master values('+departmentCode+','+departmentName+')");
			//or
			java.sql.PreparedStatement pstm= con.prepareStatement("insert into department_master values(?,?)");
			
			pstm.setInt(1, departmentCode);
			pstm.setString(2, departmentName);
		}
		catch(ClassNotFoundException|SQLException e)
		{
			e.printStackTrace();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args)
	{
		new PreparedStatement().readDataFromDatabase();
		new PreparedStatement().insertDateIntoDatebase();
	}
}
