package lab4_2;
import java.util.*;
public class TestAccount{
	
	
	
public static void main(String[] args) {
	
	Person p1=new Person("Smith",22);
	Person p2=new Person("Kathy",21);
	
	Account acc1= new SavingsAccount();
	Account acc2= new CurrentAccount();
	
	Random rand = new Random();
	
	

	acc1.setAccHolder(p1);
	acc2.setAccHolder(p2);
	
	
	acc2.setBalance(2000);

	System.out.println(acc2.getBalance());
	
	acc2.withdraw(300);
	
	
	acc1.setAccNum(rand.nextInt(100000000));
	acc2.setAccNum(rand.nextInt(100000000));
	System.out.println(acc2.getBalance());
	
	
}
}
