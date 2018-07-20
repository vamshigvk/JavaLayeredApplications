package com.capgemini.core;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 
{
	public static void main(String[] args) 
	{
		TreeSet names = new TreeSet();
		
		names.add("John");
		names.add("Peter");
		names.add("Marc");
		names.add("Anthony");
		names.add("Eric");
		names.add("Sam");
		
		TreeSet phoneNumbers = new TreeSet();
		
		phoneNumbers.add( 9898989898l );
		phoneNumbers.add( 8374833433l );
		phoneNumbers.add( 7347343424l );
		phoneNumbers.add( 8347392343l );
		
		
		//printing names:
		Iterator it = names.iterator();
		
		while( it.hasNext() )
			System.out.println( it.next() );
		
		System.out.println();
		
		//printing phone numbers
		it = phoneNumbers.iterator();
		
		while( it.hasNext() )
			System.out.println( it.next() );
		
		
		
		
		
	}
}
