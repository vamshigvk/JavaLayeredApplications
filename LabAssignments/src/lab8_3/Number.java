package lab8_3;

import java.util.Random;

public class Number extends Thread
{
	static int num=0;
	public void run()
	{
		try
		{
			Random random= new Random();
			num = Math.abs(random.nextInt(10));
			System.out.println("Number : "+ num);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		Number t1= new Number();
		t1.start();
		try {
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		FactThread t2= new FactThread(num);
		t2.start();
	}
}
