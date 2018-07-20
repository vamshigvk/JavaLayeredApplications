package com.capgemini.streamsapi.demo1;

import java.util.Arrays;
import java.util.List;

public class UsingForEachOnStreams 
{
	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Eric", "Micheal", "Jane", "Kate", "Catherine");
		
		names.stream().forEach(System.out::println);
		
		//names.forEach((name) -> System.out.println(name));
	}
}
