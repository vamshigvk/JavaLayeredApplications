package lab4_1;
import java.util.*;
public class TestBankAccount {
	
	
	
public static void main(String[] args) {
	
	Person p1=new Person("Smith",22);
	Person p2=new Person("Kathy",21);
	
	Account acc1= new Account();
	Account acc2= new Account();
	
	
	Random rand = new Random();
	
	
	
	acc1.setAccHolder(p1);
	acc2.setAccHolder(p2);
	
	acc1.setAccNum(rand.nextInt(1000000000));
	acc2.setAccNum(rand.nextInt(1000000000));
	
	acc1.setBalance(2000);
	acc2.setBalance(3000);
	
	acc1.deposit(2000);
	acc2.withdraw(2000);
	
	System.out.println("Updated balance in " + p1.getName() +"with account number:"+ acc1.getAccNum()+ " is: "+ acc1.getBalance());
	System.out.println("Updated balance in " + p2.getName() + "with account number:"+acc2.getAccNum()+" is: "+ acc2.getBalance());
	
	
	System.out.println(acc1);
	System.out.println(acc2);

}
}
