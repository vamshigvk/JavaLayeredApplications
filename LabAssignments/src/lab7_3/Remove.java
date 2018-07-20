package lab7_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Remove 
{
	public static void main(String[] args) 
	{
		List<String> myList1 = new ArrayList<String>();
		List<String> myList2 = new ArrayList<String>();
		
		myList1.add("Vamshi");
		myList1.add("Krishna");
		myList1.add("GVK");
		myList2.add("Sai");
		myList2.add("Krishna");
		myList2.add("SK");
		
		removeElements(myList1,myList2);
		System.out.println(myList1);
	}
	
	private static List<String> removeElements(List<String> list1 , List<String> list2)
	{
		Iterator<String> it = list1.iterator();
		list1.removeAll(list2);
		return list1;
	}
}
