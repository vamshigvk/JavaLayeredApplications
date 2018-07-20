package com.synergetics.methodref.demo5;

import java.util.Arrays;

public class MethodReference_ArbitraryObjectsInstanceMethod 
{
	public static void main(String[] args) 
	{
		String[] stringArray = { "Barbara", "James", "Mary", "John",
			    "Patricia", "Robert", "Michael", "Linda", "james" };
		
		Arrays.sort(stringArray, String::compareToIgnoreCase);
			
		for (String string : stringArray) {
			System.out.println(string);
		}
	}
}
