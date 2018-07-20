package com.capgemini.core;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 
{
	public static void main(String[] args) 
	{
		HashSet products = new HashSet();
		
		products.add( new Product(101, "SonyPhone", 100, 23_000) );
		products.add( new Product(233, "DellMouse", 30, 700));
		products.add( new Product(101, "SonyPhone", 100, 23_000) );
		products.add( new Product(101, "SonyPhone", 100, 23_000) );
		products.add( new Product(101, "SonyPhone", 100, 23_000) );
		products.add( new Product(101, "SonyPhone", 100, 23_000) );
		products.add( new Product(101, "SonyPhone", 100, 23_000) );
		products.add( new Product(101, null, 100, 23_000) );
		
		
		
		Iterator it = products.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}
}
