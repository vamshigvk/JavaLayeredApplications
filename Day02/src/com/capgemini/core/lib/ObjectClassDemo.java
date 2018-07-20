package com.capgemini.core.lib;



public class ObjectClassDemo 
{
	public static void main(String[] args) 
	{
		long startTime = System.nanoTime();
				
		Product p1 = new Product(101, "HTC Phone");
		Product p2 = new Product(102, "PenDrive");
		
		//System.out.println(p1 == p2);
		
//		System.out.println(  p1.equals(p2) );
		
//		System.out.println( p1.hashCode() );
//		System.out.println( p2.hashCode() );
		
		System.out.println( p1 );
		System.out.println( p2 );
		

		Class clazz = p1.getClass();
		
		System.out.println( clazz.getSimpleName() );
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello");
		}
		
		
		long endTime = System.nanoTime();
		
		System.out.println( endTime  - startTime );
	}
}
