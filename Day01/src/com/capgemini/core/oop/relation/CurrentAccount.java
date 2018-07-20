package com.capgemini.core.oop.relation;

public class CurrentAccount extends BankAccount implements BankInterest
{
	@Override
	public void withdraw(double amount) 
	{
		System.out.println("WIthdraw method of currentAccount");
		super.withdraw(amount);
	}
	
	@Override
	public void deposit(double amount) 
	{
		System.out.println("Deposit method of currentAccount");
		
		super.deposit(amount);
	}

	@Override
	public void displayAccoutType() {
		System.out.println("CurrentAccount");
	}

	@Override
	public void calcInterest() {
		
	}
}
