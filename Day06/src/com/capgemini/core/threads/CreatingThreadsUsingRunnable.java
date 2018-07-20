package com.capgemini.core.threads;

class TaskForDownloaderThread implements Runnable
{
	Browser browser;
	
	public TaskForDownloaderThread(Browser browser) {
		this.browser = browser;
	}

	@Override
	public void run() //instruction for a thread 
	{
		browser.downloadFile();
	}	
}

public class CreatingThreadsUsingRunnable 
{
	public static void main(String[] args) 
	{
		Browser browser = new Browser();
		
		TaskForDownloaderThread task = new TaskForDownloaderThread(browser);
		
		Thread t1 = new Thread( task );
		MySurfTabThread t2 = new MySurfTabThread( browser );
		
		t1.start();
		t2.start();
	}	
}
