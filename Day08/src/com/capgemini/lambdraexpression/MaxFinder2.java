package com.capgemini.lambdraexpression;

public class MaxFinder2 
{
	public static void main(String[] args) 
	{
		
		MaxFinder finder = new MaxFinder() {
			
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
		};

		int max  = finder.getMax(3,6,2,8,4);
		
		System.out.println("max " + max);
	}
}




















