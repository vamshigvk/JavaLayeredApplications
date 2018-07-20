package com.capgemini.core;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


class SortByName implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
	
		Product p1 = (Product)o1;
		Product p2 = (Product)o2;
		
		return p1.getName().compareTo( p2.getName() );
	}
	
}

class SortByPrice implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
	
		Product p1 = (Product)o1;
		Product p2 = (Product)o2;
		
		return new Float(p1.getPrice()).compareTo( new Float(p2.getPrice()));
	}
	
}

public class TreeSetDemo2 
{
	public static void main(String[] args) 
	{
		TreeSet products  = new TreeSet( new SortByName());
		
		products.add( new Product(101, "ZodiacTshirt", 200, 1300));
		products.add( new Product(324, "Watch", 100, 23000));
		products.add( new Product(564, "Apple Laptop", 120, 1_12_000));
		products.add( new Product(237, "CricketBat", 133, 2300));
		
		Iterator it = products.iterator();
		
		while( it.hasNext() )
			System.out.println( it.next() );
		
	} 	
}
