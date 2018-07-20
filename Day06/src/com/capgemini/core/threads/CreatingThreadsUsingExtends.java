package com.capgemini.core.threads;

class MySurfTabThread extends Thread
{
	Browser browser;
	
	public MySurfTabThread(Browser browser) 
	{
		this.browser = browser;
	}

	@Override
	public void run() //instructions for thread
	{
		browser.surfTab();
	}
}


public class CreatingThreadsUsingExtends 
{
	public static void main(String[] args) 
	{
		System.out.println("start application");
		
		Browser chrome = new Browser();
		
		//creating two threads
		MySurfTabThread t1 = new MySurfTabThread( chrome );
		MySurfTabThread t2 = new MySurfTabThread( chrome );
		
		t1.setName("John");
		t2.setName("Peter");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		
		//told the threads to start the work
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Application Shutting down");
	}
}
