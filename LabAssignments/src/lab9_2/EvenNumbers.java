package lab9_2;


import java.io.*;
import java.util.Scanner;

public class EvenNumbers 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		File file= new File("C:\\temp\\numbers.txt");
		
	
		
		Scanner sc = new Scanner(file).useDelimiter(",");
		
		while(sc.hasNextInt())	
		{
			int num = sc.nextInt();
			if(num%2==0)
				System.out.println(num);
				
		}
		sc.close();
	}
}
