package lab5_3;

public class HDFC extends Account
{
	@Override
	public void withdraw(double amount)
	{
		{
			if(getBalance()-amount>500) 
			{
			System.out.println("insufficient balance in your account");
			
			}
			else {
				setBalance(getBalance()-amount);
			}
		}
	}
}
