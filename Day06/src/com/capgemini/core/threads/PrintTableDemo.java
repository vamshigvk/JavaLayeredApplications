package com.capgemini.core.threads;

class TablePrinter extends Thread
{
	private int num;
	
	public TablePrinter()
	{
		
	}
	
	public TablePrinter(int num)
	{
		this.num = num;
	}
	
	@Override
	public void run() 
	{
		for (int count = 1; count <= 10; count++) 
		{
			System.out.println(Thread.currentThread().getName() + " prints " +  num + " * " + count  + " = " + (num*count) );
		}
	}
}


public class PrintTableDemo 
{
	public static void main(String[] args) 
	{
		TablePrinter t1 = new TablePrinter(4);
		
		t1.start();
	}
}
