package lab7_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListSort 
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		list.add("vamshi");
		list.add("krishna");
		list.add("pune");
		list.add("cse");
		
		System.out.println("ArrayList before sort:"+ list);
		Collections.sort(list);
		for (String string : list)
		{
			System.out.println(string);
		}
	}
}
