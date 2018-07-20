//Assignment lab 7_6

package lab7_6;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import lab7_6.*;

public class EmployeeServiceImpl7_6 
{

	private void search(String input, HashMap<String, Employee7_6> list)
	{
		//HashMap<String,Employee> list1 = new HashMap<String,Employee>();
		Set set = list.entrySet();
		Employee7_6 emp = new Employee7_6();
		Iterator i = set.iterator();
		while (i.hasNext()) {
			
			Map.Entry me = (Map.Entry) i.next();
			Employee7_6 emm1 = (Employee7_6) me.getValue();
			if(emm1.getEmpInsuranceScheme().equalsIgnoreCase(input))
				System.out.println(me.getValue());
			
			}
		 
		
	}
	
	public void delete(int id, HashMap<String, Employee7_6> list) 
	{
		
		Employee7_6 emp = new Employee7_6();
		String temp = "";
		temp = temp + id;
		list.remove(temp);
		Set set = list.entrySet();
		Iterator i = set.iterator();
		while (i.hasNext()) {
			
			Map.Entry me = (Map.Entry) i.next();
			Employee7_6 emm1 = (Employee7_6) me.getValue();
			System.out.println(me.getValue());
			
			
			}
		
		
	}
	
	
	public void sortMap(HashMap<String, Employee7_6> list)
	{
		
		Set set = list.entrySet();
		Employee7_6 emp = new Employee7_6();
		Iterator i = set.iterator();
		List<Employee7_6> empList  = new ArrayList<Employee7_6>(list.values());
		Collections.sort(empList);
		for (Employee7_6 employee : empList) 
		{
			System.out.println(employee);
		}
	}	
			
		



	
	public static void main(String[] args)
	{
		HashMap<String,Employee7_6> list = new HashMap<String,Employee7_6>();
		Employee7_6 emp1 = new Employee7_6(101, "yash", 50000, "Manager","Scheme A");
		Employee7_6 emp2 = new Employee7_6(102, "ritvik", 35000, "Programmer","Scheme B");
		Employee7_6 emp3 = new Employee7_6(103, "rahul", 12000, "System Associate","Scheme C");
		Employee7_6 emp4 = new Employee7_6(104, "jai", 11000, "System Associate","Scheme C");
		Employee7_6 emp5 = new Employee7_6(105, "shreya", 35000, "Programmer","Scheme B");
		Employee7_6 emp6 = new Employee7_6(106, "kamal", 4000, "Clerk","No Scheme");
		Employee7_6 emp7 = new Employee7_6(107, "krishna", 10000, "System Associate","Scheme C");
		String ans="";
		Scanner sc = new Scanner(System.in);
		EmployeeServiceImpl7_6 es = new EmployeeServiceImpl7_6();
		String s = "";
		s=emp1.getEmpId() + "";
		list.put(s, emp1);
		
		s=emp2.getEmpId() + "";
		list.put(s, emp2);
		
		s=emp3.getEmpId() + "";
		list.put(s, emp3);
		
		s=emp4.getEmpId() + "";
		list.put(s, emp4);
	
		s=emp5.getEmpId() + "";
		list.put(s, emp5);
		
		s=emp6.getEmpId() + "";
		list.put(s, emp6);
		
		s=emp7.getEmpId() + "";
		list.put(s, emp7);
		
		 do
		 {
			 System.out.println("enter your choice");
			 System.out.println("1. enter the insurance scheme to display the employee information");
			 System.out.println("2. enter the employee id to delete the details.");
			 System.out.println("3. sort the employee details based on the salary");
			 System.out.println("4. exit");
			 int choice = sc.nextInt();
			 switch(choice)
			 {
			 case 1 : 	System.out.println("enter the insurance details from the following.. ");
			 			System.out.println("Scheme A");
			 			System.out.println("Scheme B");
			 			System.out.println("Scheme C");
			 			System.out.println("No Scheme");
			 			Scanner sc1 = new Scanner(System.in);
			 			String input = sc1.nextLine();
			 			es.search(input,list);
				 		break;
			 case 2 : System.out.println("enter the employee id to delete the details.");
			 			int id = sc.nextInt();
			 			es.delete(id,list);
			 			break;
			 case 3 : System.out.println("sorting the employee details based on the salary");
			 			es.sortMap(list);
			 			break;
			 
			 
			 }
		 
			System.out.println("Do you want to continue yes/no");
			ans = sc.next();

		} while (ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y"));
}
}