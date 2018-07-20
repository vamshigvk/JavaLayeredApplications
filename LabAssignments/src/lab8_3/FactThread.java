package lab8_3;

public class FactThread extends Thread
{

	int num;
	public FactThread(int num)
	{
		this.num=num;
	}
	public void run()
	{
		int fact=1;
		for (int i = num; i >1; i--) {
			fact=fact*i;
		}
		System.out.println("Factorial of " +num + "is : "+ fact);
	}
}
