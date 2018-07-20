package com.capgemini.core.threads;

class SavingAccount
{
	private int id;
	private double balance;
	
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "SavingAccount [id=" + id + ", balance=" + balance + "]";
	}
}

class Transaction 
{
	SavingAccount sa;

	public Transaction(SavingAccount sa) {
		super();
		this.sa = sa;
	}
	
	public synchronized void performTransaction() 
	{
		System.out.println( Thread.currentThread().getName() + " checks balance " + sa.getBalance() );
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println( Thread.currentThread().getName() + " Performing withdrawal of 5000" );
		sa.withdraw(5000);
		
		System.out.println( Thread.currentThread().getName() + " checks balance " + sa.getBalance() );		
	}
}

class Person extends Thread
{
	private Transaction tr;
	
	public Person(Transaction tr) {
		super();
		this.tr = tr;
	}

	@Override
	public void run() 
	{
		tr.performTransaction();
	}
}


public class SynchronizationDemo 
{
	public static void main(String[] args) {

		SavingAccount sa = new SavingAccount( 10011, 1_00_000 );
		
		Transaction tr = new Transaction(sa);
		
		Person p1 = new Person(tr);
		Person p2 = new Person(tr);
		Person p3 = new Person(tr);
		
		p1.setName("Eric");
		p2.setName("John");
		p3.setName("Peter");
		
		p1.start(); p2.start(); p3.start();
	}
}













