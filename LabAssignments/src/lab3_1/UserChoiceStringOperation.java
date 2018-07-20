package lab3_1;

import java.util.Scanner;

public class UserChoiceStringOperation 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Name:");
	String str=sc.nextLine();
	System.out.println("Original String:"+str);
	System.out.println("Enter your choice");
	int choice = sc.nextInt();
	
	switch (choice)
	{
		case 1:
			String add_str=str.concat(str);
			System.out.println("String added to itself:"+add_str);
		break;
		
		case 2:
			StringBuilder replace = new StringBuilder(str);
			for (int i = 0; i < str.length(); i++) 
			{
				char currentChar = str.charAt(i);
				int index=str.indexOf(currentChar);
				if(index%2==0)
				{
					replace.setCharAt(i, '#');
				}
				System.out.println("Replacing odd positions with #:"+replace);
			}
			break;
			
		case 3:
			for (int i = 0; i < str.length(); i++)
			{
				for (int j = 0; j < i; j++) 
				{
					if (str.charAt(i)==str.charAt(j))
					{
						break;
					}
					if(j==i)
					{
						char c=str.charAt(j);
					}
					
				}
			}
			System.out.println("Removal of duplicate characters:"+str);
			break;
			
		case 4:
			StringBuilder upper = new StringBuilder(str);
			for (int i = 0; i < str.length(); i++) 
			{
				char currentChar = str.charAt(i);
				int index= str.indexOf(currentChar);
				if(index%2==0)
				{
					String toUpper=str.toUpperCase();
					char upperChar=toUpper.charAt(index);
					upper.setCharAt(i, upperChar);
				}
			}
			System.out.println("Changing odd characters to uppercase:"+upper);
	default:
		System.out.println("Invalid option choosed");
		break;
		
	}
}
}
