package com.capgemini.lambdraexpression;

public class MaxFinder3 
{
	public static void main(String[] args) 
	{
		MaxFinder finder = (int...nums) -> {
			int max = nums[0];
			
			for (int num : nums) 
			{
				if( max < num)
					max = num;
			}
			
			return max;
		};
		
		int max = finder.getMax(4,7,3,7,3);
		
		System.out.println("Max " + max);
	}
}
