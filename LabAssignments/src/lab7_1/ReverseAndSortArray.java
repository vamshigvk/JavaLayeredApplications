package lab7_1;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAndSortArray {
	
	public static void main(String[] args)
	{
	
		int [] array=new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		
		for (int i = 0; i < array.length; i++) 
		{
			array[i]=sc.nextInt();
		}

		System.out.println("Initial integer array is: ");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]);
		}
		
		String[] str= new String[array.length];
		
		for (int i = 0; i < array.length; i++) 
		{
			str[i]= Integer.toString(array[i]);	
		}
		
		for (int j = 0; j < array.length; j++) 
		{
			str[j]= new StringBuilder(str[j]).reverse().toString();
		}
		
		Arrays.sort(str);
		

		System.out.println("Array after reversing numbers and sorted is:");
		for (int k = 0; k < str.length; k++) 
		{
	System.out.println(str[k]);
		}
				

	}

}
