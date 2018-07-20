package com.capgemini.functionalinterface.demo3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.function.Function;;


public class FunctionFunctionalInterface 
{
	public static void main(String[] args) 
	{
		Function<String, Date> stringToDateConverter = (String d) -> {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate ld = LocalDate.parse(d, formatter);
			return java.sql.Date.valueOf(ld);
		};
		
		String stringDate1 = "12/04/2018";
		
		Date date1 = stringToDateConverter.apply( stringDate1 );
		
		String stringDate2 = "23/12/1999";
		
		Date date2 = stringToDateConverter.apply( stringDate2 );
		
		System.out.println("Date1: " + date1);
		System.out.println("Date1: " + date2);
	}
}
