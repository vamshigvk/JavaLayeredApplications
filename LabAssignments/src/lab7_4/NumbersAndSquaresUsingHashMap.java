package lab7_4;

import java.util.HashMap;
import java.util.Map;

public class NumbersAndSquaresUsingHashMap {

	
	static int[] array= {5,10,15,20,25};
	static HashMap hashMap = new HashMap();
	
	public static void main(String[] args)
	{
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]);
		}
		getSquares(array);
		System.out.println(hashMap);
		
	}
	
	private static Map getSquares(int array[])
	{
		for (int i = 0; i < array.length; i++) 
		{
			hashMap.put(array[i], array[i]*array[i]);
			
		}
		return hashMap;
	}
}
