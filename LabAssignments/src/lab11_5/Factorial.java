package lab11_5;

import java.util.Scanner;

public class Factorial {
	int n;
	public void fact(int n) {
		// TODO Auto-generated method stub
		int fact =1;
		for(int i=n;i>=1;i--)
		{
			fact = fact*i;
		}
		System.out.println("factorial is : " + fact);
	}
	
	
	public Factorial(int n) {
		super();
		this.n = n;
		fact(n);
	}


	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
	    FactorialInterface lm = Factorial::new;
		lm.fact(number);
	}

}
