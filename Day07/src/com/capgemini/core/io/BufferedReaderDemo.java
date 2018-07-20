package com.capgemini.core.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo 
{
	public static void main(String []abc)
	{
		//IO Chaining
		try( BufferedReader br = new BufferedReader(new FileReader("C:\\tmp\\Greetings.java") ) ) 
		{
			String lineRead = br.readLine();
			
			int counter = 0;
			
			while( lineRead != null )
			{
				//Thread.sleep(200);
				
				System.out.println( lineRead );
				
				lineRead = br.readLine();
				
				counter++;
			}
			
			System.out.println("IO Permission Asked " + counter + " times");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
