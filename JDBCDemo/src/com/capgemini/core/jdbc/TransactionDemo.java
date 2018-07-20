package com.capgemini.core.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class TransactionDemo 
{
	public static void main(String[] args) 
	{
		try(Connection con =DBUtil.getConnection()) 
		{
			try 
			{

				con.setAutoCommit(false);
				
				PreparedStatement pstm1= con.prepareStatement("insert into department_master(dept_code,dept_name) values(?,?)");
				pstm1.setInt(1,96);
				pstm1.setString(2,"dept17");
				
				pstm1.execute();
				
				PreparedStatement pstm2= con.prepareStatement("insert into department_master(dept_code,dept_name) values(?,?)");
				pstm2.setInt(1, 97);
				pstm2.setString(2,"dept20");
				
				pstm2.execute();
				
				con.commit();
				System.out.println("Transaction commited");
			}
			catch (Exception e) 
			{
				con.rollback();
				System.out.println("Transaction rollbacked");
				e.printStackTrace();
			}
		} 
		catch (Exception e) 
		{
		
		}
	}
}
