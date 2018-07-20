package lab2_5;

import java.util.Scanner;

import lab2_5.Gender.gender;

public class GenderMain
{
	public static void main(String[] args) {
		Enum<gender> g;
		Scanner sc=new Scanner(System.in);
		Gender p1=new Gender("Divya","Bharathi");
		p1.phone();
		System.out.println("Enter gender:");
		g=gender.valueOf(sc.next().toUpperCase());
		p1.display();
		System.out.println("Gender: "+g);
		
		
		
	}
}
