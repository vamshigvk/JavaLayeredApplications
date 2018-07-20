package com.capgemini.core.oop.relation;

import java.util.Scanner;

public class PolymorphismDemo 
{
	public static void main(String[] args) 
	{
//		BankAccount ba = null;
//		
//		Scanner console  = new Scanner(System.in);
//		
//		System.out.println("What type of account you want to open");
//		System.out.println("1) SavingAccount");
//		System.out.println("2) CurrentAccount");
//		
//		System.out.println("Enter choice");
//		int choice = console.nextInt();
//		
//		switch (choice) 
//		{
//			case 1:
//				ba = new SavingAccount();
//			break;
//			
//			case 2:
//				ba = new CurrentAccount();
//			break;		
//		}
//		
//		ba.deposit( 10_000 );
		
		SavingAccount sa1 = new SavingAccount(10112, "Eric", 12_000, true);
		SavingAccount sa2 = new SavingAccount(27343, "John", 21_000, false);
		
//		displayAccountDetails( sa2 );
		
		CurrentAccount ca = new CurrentAccount();
		ca.setAccountId(111);
		ca.setBalance(1_00_000);
		
//		displayAccountDetails(sa1);
//		displayAccountDetails(sa2);
//		displayAccountDetails(ca);
		
		
		
		BankAccount[] bankAccounts = new BankAccount[3];
		
		bankAccounts[0] = sa1;
		bankAccounts[1] = ca;
		bankAccounts[2] = sa2;
		
		BankAccount ca1 = bankAccounts[1];
		
		Object[] objects = new Object[10];
		
		
		
		
		
		
		
	}
	
	public static void displayAccountDetails( BankAccount ba )
	{
		System.out.println("AccountID: " +  ba.getAccountId() );
		System.out.println("Balance: "  + ba.getBalance() );
		
		if( ba instanceof SavingAccount )
		{
			//casting
			SavingAccount sa = (SavingAccount)ba;
			
			if( sa.isSalaryAccount() == true)
				System.out.println("Its a salary account");
		}
	}
	
}








