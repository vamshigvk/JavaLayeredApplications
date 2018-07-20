package lab8_4;

import java.util.Queue;
import java.util.Random;

public class CustomerThread implements Runnable
{

private Queue sharedQueue;
private final int MAX_SIZE;
public CustomerThread(Queue sharedQueue, int mAX_SIZE) 
{
	super();
	this.sharedQueue = sharedQueue;
	MAX_SIZE = mAX_SIZE;
}
@Override
public void run() 
{
	while(true)
	{
		synchronized (sharedQueue)
		{
			while(sharedQueue.size()==MAX_SIZE)
			{
				System.out.println("All products are given to the biller");
				try
				{
					sharedQueue.wait();
				}
				catch (InterruptedException e) 
				{
					System.out.println("Error"+ e);
				}
			}
			Random random = new Random();
			int i= Math.abs(random.nextInt(100));
			System.out.println(" Product"+ i);
			sharedQueue.add(i);
			sharedQueue.notify();
		}
	}
	
	
}

}
