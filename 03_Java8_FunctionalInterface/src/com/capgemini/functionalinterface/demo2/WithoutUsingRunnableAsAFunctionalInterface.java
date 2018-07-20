package com.capgemini.functionalinterface.demo2;


class MyRunnable implements Runnable
{
	@Override
	public void run() {
		System.out.println("Hello World");
	}
}


public class WithoutUsingRunnableAsAFunctionalInterface 
{
	public static void main(String[] args) {
		
		Thread t1 = new Thread( new MyRunnable() );
		
		t1.start();
		
	}
}
