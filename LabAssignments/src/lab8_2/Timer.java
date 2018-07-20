package lab8_2;
import java.util.*;
public class Timer implements Runnable
{
	public static void main(String[] args) 
	{
		Thread t= new Thread(new Timer());
		t.start();
	}
	
	@Override
	public void run()
	{
		try
		{
			System.out.println(" run method");
			for(;;)
			{
				System.out.println("Timer:"+new Date());
				Thread.sleep(10000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
