package com.capgemini.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;


class Product
{
	private int id;
	private String name;
	private float price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Product(int id) {
		super();
		this.id = id;
	}



	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}



	public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	


//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		return result;
//	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	
}


public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList myList = new ArrayList();

		myList.add("sunday");
		myList.add("monday");
		myList.add("sunday");
		myList.add(1234); //autoboxing
		myList.add(12.5);
		myList.add( new Date() );
		myList.add( new Product(101, "SonyPhone", 12000) );

		System.out.println( myList );

		//traversing collection

//		for (int index = 0; index < myList.size(); index++) 
//		{
//
//			Object obj = myList.get( index );
//
//			if ( obj instanceof String )
//			{
//				String s = (String)obj;
//
//				System.out.println( s.toUpperCase() );
//
//			}
//			else
//				System.out.println( obj );
//		}

//		for (Object object : myList) {
//			System.out.println( object );
//		}

//		Iterator it = myList.iterator();
//		
//		while( it.hasNext() )
//		{
//			Object obj = it.next();
//			
////			it.remove();
//			
//			System.out.println( obj );
//		}
		
		//Contains
		
//		if( myList.contains(1234) )
//		{
//			System.out.println("exists");
//		}
//		else
//		{
//			System.out.println("does not exists");
//		}
		
		//Search
		
//		int index = myList.indexOf("monday");
//		
//		if( index != -1) //obj exists
//		{
//			String s = (String) myList.get(  index ); 
//		}
		
//		String s = (String) myList.get(1);
//		s = s.toUpperCase();
//		
//		myList.remove(1);
//		myList.add(1, s);
//		
//		System.out.println( myList );
		
		
		
		//for known location
//		Product p = (Product)myList.get(6);
//		
//		p.setPrice(18000);
//		
//		System.out.println( myList );
		
		
		//for unknown location
		int index  = myList.indexOf( new Product(101) );
		
		Product p = (Product)myList.get(index);
		
		p.setPrice(18000);
		
		System.out.println( myList );
		
		//remove object
		
		//by location
		myList.remove(0);
		
		//by type
		myList.remove("monday");
	}
}










































