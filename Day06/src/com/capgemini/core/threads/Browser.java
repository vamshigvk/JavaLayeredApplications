package com.capgemini.core.threads;

public class Browser 
{
	//you are using a tab to surf a page
	public void surfTab()
	{
		for (int pageLoadStatus = 0; pageLoadStatus <= 100; pageLoadStatus += 10 ) 
		{	
			
//			try 
//			{
//				if(Thread.currentThread().getName().equals("John"))
//				Thread.sleep(50);
//			
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			System.out.println( Thread.currentThread().getName() + " prints " +  
					pageLoadStatus + "% page loaded");
		}
	}
	
	//you have started downloading a file
	public void downloadFile()
	{
		for (int downloadStatus = 0; downloadStatus <= 100; downloadStatus += 10) 
		{
			System.out.println(Thread.currentThread().getName() + " prints " + 
					downloadStatus + "% File downloaded");
		}
	}
}
