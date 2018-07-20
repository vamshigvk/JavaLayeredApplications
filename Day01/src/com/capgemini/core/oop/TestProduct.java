package com.capgemini.core.oop;

public class TestProduct {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		
		p1.setId( 101 );
		p1.setName( "SonyHeadphone" );
		p1.setPrice( 1200 );
		
		System.out.println( p1.getId() );
		System.out.println( p1.getName() );
		System.out.println( p1.getPrice() );
		
	}
	
}
