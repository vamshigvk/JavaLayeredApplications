package com.capgemini.streamsapi.demo1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WithoutUsingForEachOnStreams 
{
	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Eric", "Micheal", "Jane", "Kate", "Catherine");
		
		for (int index = 0; index < names.size(); index++) 
		{
			String name = names.get( index );
			
			System.out.println( name );
		}
		
		//spacer
		System.out.println();
		
		//More Example below
		
		
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
	}
}
