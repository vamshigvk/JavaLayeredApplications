package com.capgemini.streamsapi.demo9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NormalStream 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>();

		for(int i = 1; i< 1_00_00_000; i++){
			list.add(i);
		}

		double start = System.currentTimeMillis();
		
		//Here creating a parallel stream
		Stream<Integer> stream1 = list.stream(); 

		Integer[] evenNumbersArr = stream1.filter(i -> i%2 == 0).toArray(Integer[]::new);
		
		Stream<Integer> stream2 = list.stream(); 

		Integer[] oddNumbersArr = stream2.filter(i -> i%2 != 0).toArray(Integer[]::new);

		System.out.println( "evenNumbersArr.length : " + evenNumbersArr.length );
		System.out.println( "oddNumbersArr.length : " + oddNumbersArr.length );
		
		double end = System.currentTimeMillis();
		
		System.out.println("Time Taken: " + (end -start) + " Mili seconds");
	}
}
