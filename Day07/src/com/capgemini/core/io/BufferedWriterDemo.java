package com.capgemini.core.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class BufferedWriterDemo 
{
	public static void main(String[] args) 
	{
		Scanner console = new Scanner( System.in );
		
		ArrayList<String> userDate = new ArrayList<>();
		
		String reply = null;
		
		do 
		{
			System.out.println("Enter something to write to the file");
			userDate.add( console.nextLine() );
			
			System.out.println("Do you want to continue? (yes or no)");
			reply = console.nextLine();
			
		} while ( reply.trim().equalsIgnoreCase("yes") );
		
		
		//IO Operation Below
		
		try (BufferedWriter bw = new BufferedWriter( new FileWriter("c:\\tmp\\UserInput.txt", true) ) )
		{
			for (String line : userDate) 
			{
				bw.write(line);
				bw.newLine();
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}	
}
