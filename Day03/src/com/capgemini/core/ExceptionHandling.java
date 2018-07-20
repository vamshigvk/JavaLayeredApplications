package com.capgemini.core;

class Calculator
{
	public static int div( int[] nums ) throws NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException
	{

		int result = 0;

//		try 
//		{
			int num1 = nums[0];
			int num2 = nums[1];
			result = num1 / num2;
//		}
//		catch( ArithmeticException e)
//		{
//			e.printStackTrace();
//		}
//		catch(NullPointerException e)
//		{
//			e.printStackTrace();
//		}
//		catch (ArrayIndexOutOfBoundsException e) 
//		{
//			System.out.println( e.getMessage() );
//		}
//		catch (Exception e) 
//		{
//			e.printStackTrace();
//		}
//		finally
//		{
//			
//		}
		
		return result;
	}
}


public class ExceptionHandling 
{
	public static void main(String[] args) 
	{
		System.out.println("Application started");
		
		int[] nums = null;//new int[] {10};

		int result = 0;
		
		try 
		{
			result = Calculator.div( nums );
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println( "result = " + result );
		
		System.out.println("Application shutting down");
	}
}


