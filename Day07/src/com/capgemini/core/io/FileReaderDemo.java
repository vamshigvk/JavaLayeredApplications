package com.capgemini.core.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileReaderDemo 
{
	public static void main(String[] args) 
	{

		try( FileReader fileReader = new FileReader("C:\\tmp\\Gretings.java"))
		{
			
			int charRead = fileReader.read();

			int counter = 0;
			
			while( charRead != -1)
			{
				Thread.sleep(50);
				
				System.out.print( (char)charRead );
				
				charRead = fileReader.read();
				
				counter++;
			}
			
			System.out.println("IO Permission ASked " + counter + " times");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
