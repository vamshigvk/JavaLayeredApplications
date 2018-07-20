package com.capgemini.lesson20.runnable;

public class HelloMain {

	public static void main(String[] args) {
		

	    HelloRunnable hello = new HelloRunnable();
		Thread helloThread = new Thread(hello);
	
		helloThread.start();
	
	}

}
