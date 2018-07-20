package com.capgemini.core;

public class GenericsDemo 
{
	public static void main(String[] args) 
	{
		Holder<String> names = new Holder<>();
		
		names.add("John");
		names.add("Smith");
		
		System.out.println( names.get(0) );
		System.out.println( names.get(1) );
		
		
		Holder<Integer> numbers = new Holder<>();
		
		numbers.add(343);
		numbers.add(343);
		numbers.add(343);
		
		System.out.println( numbers.data );
	}
}
