package com.capgemini.core.oop.relation;

public abstract class BankAccount implements BankTransaction
{
	protected int accountId;
	protected String clientName;
	protected double balance;
	
	//constructors
	
	public BankAccount() 
	{
		System.out.println("para less constructor of bankaccount");
	}

	public BankAccount(int accountId, String clientName, double balance) {
	
		System.out.println("para constructor of bankaccount");
		
		this.accountId = accountId;
		this.clientName = clientName.toUpperCase();
		this.balance = balance + 500;
	}
	
	public abstract void displayAccoutType();
	
	//getters and setters

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//Transaction methods
	
	public void deposit( double amount )
	{
		balance += amount;
	}
	
	public void withdraw( double amount )
	{
		if( amount > balance )
		{
			System.out.println("Transaction Denied: Insufficient Balance");
			return;
		}
		
		balance -= amount;
	}
	
	
}









