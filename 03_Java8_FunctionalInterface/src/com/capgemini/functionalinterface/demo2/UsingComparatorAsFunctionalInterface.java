package com.capgemini.functionalinterface.demo2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsingComparatorAsFunctionalInterface 
{
	public static void main(String[] args) 
	{
		List<Product> products =  Arrays.asList( 
				new Product(9437, "Mobile", 12000), 
				new Product(123, "PenDrive", 900), 
				new Product(345, "Mouse", 1800) );
		
		Collections.sort(products, (Product p1, Product p2) -> p1.getPrice() - p2.getPrice());
		
		products.forEach(System.out::println);
	}
}
