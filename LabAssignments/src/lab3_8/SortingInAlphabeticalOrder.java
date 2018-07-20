package lab3_8;

import java.util.Scanner;

public class SortingInAlphabeticalOrder 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		
		int inp=sc.nextInt();
		
		String[] inparr= new String[inp];
		
		String temp;
		
		for (int i = 0; i < inparr.length; i++) 
		{
			inparr[i]=sc.next();
		}
		
		for (int i = 0; i < inparr.length; i++) 
		{
			for (int j = i+1; j < inparr.length; j++) 
			{
				if(inparr[i].compareTo(inparr[j])>0)
				{
					temp=inparr[i];
					inparr[i]=inparr[j];
					inparr[j]=temp;
				}
			}
		}
		for (int i = 0; i < inparr.length/2; i++) 
		{
			System.out.println(inparr[i].toUpperCase());
		}
		
		for (int j =  inparr.length/2; j < inparr.length; j++)
		{
			System.out.println(inparr[j].toLowerCase());
		}
	}
}
