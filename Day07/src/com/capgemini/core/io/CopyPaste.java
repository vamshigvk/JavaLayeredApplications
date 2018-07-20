package com.capgemini.core.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyPaste 
{
	public static void main(String[] args) 
	{
		String sourceFile = "C:\\Training\\IMG_0052.JPG";
		String destinationFile = "C:\\tmp\\IMG_0052.JPG";
		
		try (FileInputStream fis = new FileInputStream( sourceFile );  
				FileOutputStream fos = new FileOutputStream( destinationFile ))
		{
			long startTime = System.currentTimeMillis();
			
			int binRead = fis.read();
			
			while( binRead != -1 )
			{
				fos.write( binRead );
				
				binRead = fis.read();
			}
			
			long endTime = System.currentTimeMillis();
			
			long timeElapsed = (endTime - startTime) / 1000;
			
			System.out.println("Copy Successful. Took " + timeElapsed + " seconds");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
