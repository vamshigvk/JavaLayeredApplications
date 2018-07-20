package lab4_2;

public class SavingsAccount extends Account
{
	public  final double min_balance=500;
	
	@Override
	public void withdraw(double amount)
	{
		if(getBalance()-amount>min_balance)
		{
			setBalance( getBalance()-amount);
			System.out.println("Money withdrawed:"+ getBalance());
		}
	}

	
	
}
