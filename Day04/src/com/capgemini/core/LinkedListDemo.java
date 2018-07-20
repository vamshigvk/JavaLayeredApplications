package com.capgemini.core;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add( "sunday" );
		myList.add( "monday" );
		myList.add( "sunday" );
//		myList.add( 123 );
//		myList.add( 34.43 );
//		myList.add( new Date() );
		
		//traversing : using iterator - traverse in forward direction only
		
//		Iterator it = myList.iterator();
//
//		while( it.hasNext() )
//			System.out.println( it.next() );
				
		//Using List Iterator - traverse in both direction
		
		ListIterator lit = myList.listIterator();
		
		//in forward direction
		while( lit.hasNext() )
		{
			Object obj = lit.next();
			
			String str = (String)obj;
			
			System.out.println(str.toUpperCase());
		}
		
//		System.out.println();
//		
//		//in reverse direction
//		while( lit.hasPrevious() )
//			System.out.println( lit.previous() );
	}
}











