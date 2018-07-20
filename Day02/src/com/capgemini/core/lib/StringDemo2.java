package com.capgemini.core.lib;

import java.util.Scanner;

public class StringDemo2 
{
	public static void main(String[] args) 
	{
		for (int index = 0; index < args.length; index++) 
		{
			System.out.println( args[index] );
		}
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter your email");
//		
//		String email = scan.next();
//		
//		String[] arr = email.split("@");		
//		System.out.println( arr[0] );
//		
//		
//		int index = email.indexOf("@");		
//		String subString = email.substring(0, index);		
//		System.out.println(subString);
	}
}
