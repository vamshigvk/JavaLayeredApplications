package com.capgemini.core.oop.relation;

public class TestAccount 
{	
	public static void main(String[] args) 
	{
		SavingAccount sa = new SavingAccount(1011, "John", 50000, false);
		
		System.out.println( sa.getAccountId() );
		System.out.println( sa.getClientName() );
		System.out.println( sa.getBalance() );
		
		
		//testing withdrawal
		System.out.println( "Withdrawing 40,000" );
		sa.withdraw( 40_000 );
		System.out.println( "balance after withdrawal " + sa.getBalance() );
		
		//testing restriction
		System.out.println( "withdrawing 20,000" );
		sa.withdraw( 20_000 );
		System.out.println( "balance after withdrawal " + sa.getBalance() );
		
		//Testing deposit
		System.out.println( "depositing 45,999.50" );
		sa.deposit( 45_555.50d );
		System.out.println( "balance after depositing " + sa.getBalance() );
		
	}
}
