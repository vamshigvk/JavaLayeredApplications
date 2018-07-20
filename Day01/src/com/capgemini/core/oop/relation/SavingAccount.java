package com.capgemini.core.oop.relation;

public class SavingAccount extends BankAccount 
{
	private boolean isSalaryAccount;
	
	public SavingAccount() {
		super();
		System.out.println(" Constructor of SavingAccount Called");
	}
	
	public SavingAccount(int accountId, String name, double balance, boolean isSalaryAccount) 
	{
		super(accountId, name, balance);
		this.isSalaryAccount = isSalaryAccount;		
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	@Override
	public void displayAccoutType() {
		System.out.println();
	}
	
	
	
}
