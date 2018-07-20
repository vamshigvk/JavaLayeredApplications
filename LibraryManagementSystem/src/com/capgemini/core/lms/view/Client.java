package com.capgemini.core.lms.view;

import com.capgemini.core.lms.bean.Book;
import com.capgemini.core.lms.dao.LMSDAO;
import com.capgemini.core.lms.dao.LMSDAOImpl;

public class Client 
{
	public static void main(String[] args)
	{
		LMSDAO lmsDAO = new LMSDAOImpl();
		
		//addBlock
		
		Book book1 = new Book("BasicJava", "Vamshi", 100);
		Book book2 = new Book("BasicC", "Krishna", 200);
		
		int book1Id=0;
		int book2Id=0;
		
		try 
		{
			book1Id=lmsDAO.addBook(book1);
			book2Id=lmsDAO.addBook(book2);
			
			System.out.println("Book1 id:"+book1Id);
			System.out.println("Book2 id:"+book2Id);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		//getBooks
		try 
		{
			Book book3=lmsDAO.getBook(book1Id);
			Book book4=lmsDAO.getBook(book2Id);
			
			System.out.println("Book1 :"+book3);
			System.out.println("Book2 :"+book4);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
}
