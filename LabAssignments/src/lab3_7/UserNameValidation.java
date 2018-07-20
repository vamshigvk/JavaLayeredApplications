package lab3_7;

import java.util.Scanner;

public class UserNameValidation 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	String userName = sc.next();
	String[] leftPart=userName.split("_");
	int length=leftPart[0].length();
	
		if(userName.endsWith("_job")&&length>=8)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	
}
