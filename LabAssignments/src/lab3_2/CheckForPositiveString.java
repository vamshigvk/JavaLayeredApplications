package lab3_2;

import java.util.Scanner;

public class CheckForPositiveString 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String str=sc.nextLine();
		char pre=' ';
		char post=' ';
		int preascii=0;
		int postascii=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				pre=str.charAt(i);
				post=str.charAt(j);
				preascii=(int)pre;
				postascii=(int)post;
			}
		}
		if(preascii<postascii)
		{
			System.out.println("String is Positive");
		}else
		{
			System.out.println("String is Negative");
		}
	}
}
