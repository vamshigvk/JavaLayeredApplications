package com.capgemini.core.lib;

import java.util.Scanner;

public class StringDemo1 
{
	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		
		System.out.println("Insert a string");
		
		String str = console.nextLine();
		
		String[] words = str.split(" ");
		
		System.out.println( "Words count: " + words.length);
		
		int noOfSpaces = words.length - 1;
		
		System.out.println( "Char count: " + (str.length() - noOfSpaces) );
		
	}
}
