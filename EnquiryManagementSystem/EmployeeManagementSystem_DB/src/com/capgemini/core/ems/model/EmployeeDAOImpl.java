package com.capgemini.core.ems.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.core.ems.beans.Employee;
import com.capgemini.core.ems.exceptions.EMSException;
import com.capgemini.core.ems.util.DBUtil;

public class EmployeeDAOImpl implements EmployeeDAO
{
	@Override
	public int addEmployee(Employee employee) throws EMSException
	{	

		int employeeId=0;
		try(Connection con=DBUtil.getConnection())
		{
			//generate empid
			Statement stm= con.createStatement();
			ResultSet res = stm.executeQuery("select empid_seq.nextVal from dual");
			
			if(res.next()==false)
			{
				throw new EMSException("Could not generate employee id");
			}
			
			employeeId=res.getInt(1);
			System.out.println("generated id "+employeeId);
			employee.setId(employeeId);
			System.out.println("adding"+employee);
			// insert emp details
			
			PreparedStatement pstm=con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			
			pstm.setInt(1, employee.getId());
			pstm.setString(2, employee.getName());
			pstm.setDouble(3, employee.getSalary());
			pstm.setString(4, employee.getDepartment());
			pstm.setDate(5, new java.sql.Date( employee.getDateOfBirth().getTime()));
			pstm.setDate(6, new java.sql.Date(employee.getDateOfJoining().getTime()));
			
			pstm.execute();
			return employeeId;
		}
		catch (Exception e) 
		{
			throw new EMSException(e.getMessage());
		}
		
}


	@Override
	public Employee getEmployee(int id) throws EMSException 
	{
		Employee emp=null;
		try(Connection con = DBUtil.getConnection())
		{
			PreparedStatement pstm= con.prepareStatement("select * from Employee where id=?");
			pstm.setInt(1, id);
			
			ResultSet rs= pstm.executeQuery();
			
			if(rs.next()==false)
				throw new EMSException("No Employee found with id:"+id);
			
			emp=new Employee();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setSalary(rs.getDouble(3));
			emp.setDepartment(rs.getString(4));
			emp.setDateOfBirth(rs.getDate(5));
			emp.setDateOfJoining(rs.getDate(6));
		}
		catch (Exception e)
		{
			throw new EMSException(e.getMessage());
		}
		return emp;
		
	}


	@Override
	public void updateEmployee(Employee employee) throws EMSException 
	{
		int id= employee.getId();
		try(Connection con = DBUtil.getConnection()) 
		{
			  Statement stmt = con.createStatement();
			  String sql = "update employee set name="+employee.getName()+""
			  		+ "salary="+employee.getSalary()+" department="+employee.getDepartment()+
			  		" dateofbirth="+employee.getDateOfBirth()+" dateofjoining="+employee.getDateOfJoining()+" WHERE id = "+id;
			  stmt.executeUpdate(sql);
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}


	@Override
	public Employee removeEmployee(int id) throws EMSException 
	{
		Employee employee= new Employee();
		try(Connection con = DBUtil.getConnection()) 
		{
			  Statement stmt = con.createStatement();
			  String sql = "DELETE FROM employee WHERE id = "+id;
			  stmt.executeUpdate(sql);
			  sql = "SELECT id, name, salary, department , dateofbirth, dateofjoining FROM employee";
		      ResultSet rs = stmt.executeQuery(sql);
		      if(rs!=null)
		      {
		      employee.setId(rs.getInt("id"));
		      employee.setName(rs.getString("name"));
		      employee.setSalary(rs.getDouble("salary"));
		      employee.setDepartment(rs.getString("department"));
		      employee.setDateOfBirth(rs.getDate("dateofbirth"));
		      employee.setDateOfJoining(rs.getDate("dateofjoining"));
		      }
		      else
		      {
		    	  throw new EMSException("Employee not found with id"+id);
		      }
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		return employee;
	}


	@Override
	public List<Employee> getAllEmployees() throws EMSException 
	{
		List<Employee> mylist =  new ArrayList<Employee>();
		try(Connection con = DBUtil.getConnection()) 
		{
		Statement smt=con.createStatement();
		
		String q="Select * from employees";
		
		ResultSet rs=smt.executeQuery(q);
		
			if(rs.next()){ 
				do{
					Employee employee = new Employee();
					employee.setId(rs.getInt(1));
					employee.setName(rs.getString(2));
					employee.setSalary(rs.getDouble(3));
					employee.setDepartment(rs.getString(4));
					employee.setDateOfBirth(rs.getDate(5));
					employee.setDateOfJoining(rs.getDate(6));
				
				mylist.add(employee);
				}while(rs.next());
			}
			else
			{
				System.out.println("Record Not Found...");
			}
			con.close();
			
			}
		catch (SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return mylist;
		
	}

}
