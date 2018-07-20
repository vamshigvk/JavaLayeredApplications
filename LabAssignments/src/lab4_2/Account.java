package lab4_2;



public class Account extends Person {
private long accNum;
private double balance;
Person accHolder;

public  void deposit(double amount)
{
	balance=balance+amount;
}
public void withdraw(double amount)
{
	if(balance-amount>500) 
	{
	System.out.println("insufficient balance in your account");
	
	}
	else {
		balance=balance-amount;
	}
}
public long getAccNum() {
	return accNum;
}
public void setAccNum(long accNum) {
	this.accNum = accNum;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public Person getAccHolder() {
	return accHolder;
}
public void setAccHolder(Person accHolder)
{
	this.accHolder = accHolder;
}
@Override
public String toString() {
	return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
}

}

