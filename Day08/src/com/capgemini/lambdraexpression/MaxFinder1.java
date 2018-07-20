package com.capgemini.lambdraexpression;

class Finder implements MaxFinder
{
	@Override
	public int getMax(int... nums) 
	{
		int max = nums[0];
		
		for (int num : nums) 
		{
			if( max < num)
				max = num;
		}
		
		return max;
	}	
}


public class MaxFinder1 
{
	public static void main(String[] args) 
	{
		int max  = new Finder().getMax(3,6,2,8,4);
		
		System.out.println("max " + max);
	}
}
