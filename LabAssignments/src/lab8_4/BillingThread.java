package lab8_4;

import java.util.Queue;

public class BillingThread implements Runnable 
{
private Queue sharedQueue;
private final int MAX_SIZE;
public BillingThread(Queue sharedQ, int MAX_SIZE)
{
	super();
	this.sharedQueue=sharedQ;
	this.MAX_SIZE=MAX_SIZE;
}
	@Override
	public void run() 
	{
	
		while(true)
		{
			synchronized (sharedQueue)
			{
				while(sharedQueue.isEmpty())
				{
					try
					{
						System.out.println("Billing completed");
						sharedQueue.wait();
					}
					catch (Exception e) 
					{
						System.out.println("Error"+ e);
					}
				}
				System.out.println("Billing Product"+ sharedQueue.remove());
			}
		}
		
	}
	
}
