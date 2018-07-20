package com.capgemini.core.threads.threadcommunication;

public class Eater extends Thread 
{
	FoodItem foodItem;
	Waiter waiter = new Waiter(foodItem);

	
	public Eater(FoodItem foodItem) {
		this.foodItem = foodItem;
	}
	
	@Override
	public void run() 
	{
		for (int index = 0; index < waiter.foodList.length; index++) 
		{
			try 
			{
				foodItem.eat( waiter.foodList[ index ] );
			
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
