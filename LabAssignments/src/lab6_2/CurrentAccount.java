package lab6_2;


public class CurrentAccount extends Account
{
	public double overDraftLimit=5000;
	
	@Override
	public void withdraw(double amount)
	{
		if(amount-getBalance()>overDraftLimit)
		{
			System.out.println("insufficient funds");
		}
		else if(getBalance()-amount>0)
		{
			setBalance(getBalance()-amount);
			System.out.println(getBalance());
		}
		else if(amount-getBalance()<overDraftLimit)
		{
			double temp= amount-getBalance();
			setBalance(getBalance()-amount+temp);
			System.out.println("Remaining balance after Amount withdrawed is:"+ getBalance() );
		}
		
	}
	

}
