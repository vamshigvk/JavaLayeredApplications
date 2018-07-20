package com.capgemini.core;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo 
{
	public static void main(String[] args) 
	{
		HashSet mySet = new HashSet();
		
		mySet.add("Tuesday");
		mySet.add("Monday");
		mySet.add("Trinity");
		mySet.add("John");
		mySet.add("Hello");
		mySet.add("hello");
		mySet.add("Hello");
		
		Iterator it = mySet.iterator();
		
		while( it.hasNext() )
		{
			System.out.println( it.next() );
		}
	}
}
