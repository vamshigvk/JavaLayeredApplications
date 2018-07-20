package com.capgemini.core;

//interface CupSize
//{
//	int CUPSIZE_SMALL = 1;
//	int CUPSIZE_REGULAR = 2;
//	int CUPSIZE_LARGE = 3;
//}

enum CupSize
{
	CUPSIZE_SMALL, CUPSIZE_REGULAR, CUPSIZE_LARGE
}

class CafeCoffeeDay //implements CupSize
{	
	public void orderCoffee( CupSize cupSize )
	{
		switch (cupSize) 
		{
		case CUPSIZE_SMALL:
				System.out.println("You ordered coffee small");
			break;

		case CUPSIZE_REGULAR:
			System.out.println("You ordered coffee regular");
		break;
		
		case CUPSIZE_LARGE:
			System.out.println("You ordered coffee large");
		break;
			
		default:
			System.out.println("Invalid cup size");
			break;
		}
	}
}


public class EnumDemo 
{
	public static void main(String[] args) 
	{
		CafeCoffeeDay ccd = new CafeCoffeeDay();
		
		ccd.orderCoffee( CupSize.CUPSIZE_LARGE );
	}
}















