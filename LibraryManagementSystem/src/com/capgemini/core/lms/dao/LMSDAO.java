package com.capgemini.core.lms.dao;

import java.util.*;

import com.capgemini.core.lms.Exceptions.LMSExceptions;
import com.capgemini.core.lms.bean.Book;

public interface LMSDAO 
{
	public int addBook(Book book) throws LMSExceptions;
	public Book getBook(int bookId) throws LMSExceptions;
	
	public void updateBook(Book book)throws LMSExceptions;
	public Book removeBook(int bookId)throws LMSExceptions;
	
	public List<Book> getBooks() throws LMSExceptions;
}
