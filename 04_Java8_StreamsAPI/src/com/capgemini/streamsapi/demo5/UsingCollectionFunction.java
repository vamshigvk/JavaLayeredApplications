package com.capgemini.streamsapi.demo5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingCollectionFunction 
{
	public static void main(String[] args) 
	{
		String str[] = new String[] {"AMAN", "Amitabh", "lokesh", "RAHUL", 	"rahul", "salman", "SHARUKH", "Shekhar", "YANA"};
		
		List<String> names = Arrays.asList( str );
		List<String> capitalNames = new ArrayList<>();
		
		capitalNames = names.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
		
		capitalNames.stream().forEach(System.out::println);
	}
}
