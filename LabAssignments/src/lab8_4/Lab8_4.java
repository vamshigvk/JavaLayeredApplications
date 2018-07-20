package lab8_4;

import java.util.LinkedList;
import java.util.Queue;

public class Lab8_4 
{
	public static void main(String[] args) 
	{
		Queue sharedQ = new LinkedList();
		final int MAX_SIZE=5;
		Thread customer = new Thread(new CustomerThread(sharedQ , MAX_SIZE));
		Thread biller = new Thread(new BillingThread(sharedQ , MAX_SIZE));
		customer.start();
		biller.start();
	}
}
