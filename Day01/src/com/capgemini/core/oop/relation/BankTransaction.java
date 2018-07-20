package com.capgemini.core.oop.relation;

public interface BankTransaction 
{
	public double getBalance();
	public void withdraw(double amount);
	public void deposit(double amount);
}
