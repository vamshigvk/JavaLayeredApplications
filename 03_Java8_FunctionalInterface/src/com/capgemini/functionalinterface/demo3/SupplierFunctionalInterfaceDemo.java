package com.capgemini.functionalinterface.demo3;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierFunctionalInterfaceDemo 
{
	public static Supplier<LocalDate> createCurrentLocalDateSupplierFactory()
	{
		return () -> LocalDate.now();
	}
	
	public static void main(String[] args) 
	{
		Supplier<LocalDate> currentLocalDateSuppler = createCurrentLocalDateSupplierFactory();
		
		System.out.println( currentLocalDateSuppler.get() );
	}
}
