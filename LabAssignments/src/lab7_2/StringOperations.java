package lab7_2;
import java.util.*;
public class StringOperations 
{
	public static void main(String[] args) 
	{
		String s1,s2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first string:");
		s1=sc.next();
		System.out.println("Enter second string smaller than first: ");
		s2=sc.next();
		List<String> sList = new ArrayList<>();
		
		char[] cArray1=s1.toCharArray();
		char[] cArray2=s2.toCharArray();
		for (int i = 0; i < cArray2.length; i++) 
		{
			cArray1[i]=cArray2[i];
		}
		sList.add(String.valueOf(cArray1));
				
		
		
		if(s1.contains(s2) && (s1.indexOf(s2)!=s1.lastIndexOf(s2)))
		{
			StringBuilder sb= new StringBuilder(s2);
			sb.reverse();
			String temp=s1.substring(0,s1.lastIndexOf(s2));
			temp+=sb;
			temp+=s1.substring(s1.lastIndexOf(s2)+s2.length(),s1.length());
			sList.add(temp);
		}
		else
		{
			sList.add(s1.concat(s2));
		}
		
		
		if(s1.contains(s2)&&(s1.indexOf(s2)!=s1.lastIndexOf(s2)))
		{
			String temp=s1.replaceFirst(s2, "");
			sList.add(temp);
		}
		else
		{
			sList.add(s1);
		}
		
		
		if(s2.length()%2==0)
		{
			int temp=s2.length()/2;
			String res=s2.substring(0,temp);
			res=res+s1;
			res=res+s2.substring(temp, s2.length());
			sList.add(res);
		}
		else
		{
			int temp=(s2.length()/2)+1;
			String res=s2.substring(0, temp);
			res+=s1;
			res+=s2.substring(temp, s2.length());
			sList.add(res);
		}
		
		
		
		cArray2=s2.toCharArray();
		for (int count = 0; count < s2.length(); count++)
		{
			if(s1.contains(String.valueOf(cArray2[count])))
			{
				s1=s1.replaceAll(String.valueOf(cArray2[count]), "*");
			}
		}
		sList.add(s1);
		
		System.out.println("1"+sList.get(0));
		System.out.println("2"+sList.get(1));
		System.out.println("3"+sList.get(2));
		System.out.println("4"+sList.get(3));
		System.out.println("5"+sList.get(4));

	}
}
