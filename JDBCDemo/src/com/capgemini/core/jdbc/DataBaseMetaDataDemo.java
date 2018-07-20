package com.capgemini.core.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;

public class DataBaseMetaDataDemo 
{
	public static void main(String[] args) 
	{
		try(Connection con =DBUtil.getConnection())
		{
			DatabaseMetaData databaseMetaData=con.getMetaData();
			
			PreparedStatement pstm=  con.prepareStatement("select * from employees");
			
			ResultSet res=   pstm.executeQuery();
			
			ResultSetMetaData resultSetMetaData = res.getMetaData();
			
			//Query database
			System.out.println("Database Method");
			System.out.println("Database product Name: "+ databaseMetaData.getDatabaseProductName());
			System.out.println("Does it supports storedProcedures: "+ databaseMetaData.supportsStoredProcedures());
			
			
			//Query ResultSet
			System.out.println("ResultSet Meta Data");
			System.out.println("Column count: "+ resultSetMetaData.getColumnCount());
			System.out.println("Is column 1 auto incremenet: "+ resultSetMetaData.isAutoIncrement(1));
	
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
