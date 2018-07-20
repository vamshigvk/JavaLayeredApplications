package com.capgemini.functionalinterface.demo3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterfaceDemo 
{
	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Sunil", "Ramesh", "Rohit", "Ajay", "Pradnya", "Becky");
		
//		printNames(names, (name) -> System.out.println(name.toUpperCase()) );
		printNames(names, (name) -> System.out.println(name.toLowerCase()) );
	}
	
	public static void printNames( List<String> names, Consumer<String> consumer)	
	{
		
		for (String name : names) 
		{
			consumer.accept( name );
		}
	}
}
