package lab9_1;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class ReverseFileCopy 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fromFile = new FileInputStream("C:\\temp\\numbers.txt");
		FileOutputStream toFile = new FileOutputStream("C:\\temp\\storyteller.txt");
	
			int i=fromFile.read();
			int count=0;
			
			String st=""+(char)i;
			
			while (i!=-1)
			{
				i=fromFile.read();
				st=st+(char)i;
				
			}
			
			for (int j = st.length()-2; j >=0; j--)
			{
				int k=st.charAt(j);
				toFile.write(k);
			}
			System.out.println(st);
	}
}
