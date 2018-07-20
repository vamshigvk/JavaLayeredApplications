package com.capgemini.functionalinterface.demo2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortByPrice implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getPrice() - o2.getPrice();
	}
	
}

public class WithtoutUsingComparatorAsFunctionalInterface 
{
	public static void main(String[] args) 
	{
		List<Product> products =  Arrays.asList( 
				new Product(9437, "Mobile", 12000), 
				new Product(123, "PenDrive", 900), 
				new Product(345, "Mouse", 1800) );
		
		Collections.sort(products, new SortByPrice());
		
		for (int index = 0; index < products.size(); index++) {
			System.out.println( products.get(index) );
		}
	}
}
