package com.capgemini.streamsapi.demo5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithoutUsingCollectionFunction {
	public static void main(String[] args) 
	{
		String str[] = new String[] {"AMAN", "Amitabh", "lokesh", "RAHUL", 	"rahul", "salman", "SHARUKH", "Shekhar", "YANA"};
		
		List<String> names = Arrays.asList( str );
		List<String> capitalNames = new ArrayList<>();
		
		for (int index = 0; index < names.size(); index++) 
		{
			String name = names.get(index);
			
			String capitalizedName = name.toUpperCase();
			
			capitalNames.add(capitalizedName);
		}
		
		for (int index = 0; index < capitalNames.size(); index++) {
			
			String capitalizedName = capitalNames.get( index );
			
			System.out.println( capitalizedName );
		}
	}
}
