package lab8_1;
import java.io.*;

public class CopyDataThread  extends Thread
{
	FileInputStream fromFile;
	FileOutputStream toFile;
	public CopyDataThread(FileInputStream fromFile, FileOutputStream toFile) {
		super();
		this.fromFile = fromFile;
		this.toFile = toFile;
	}
	
@Override
public void run()
{
	try 
	{
		int count=0;
		int i= fromFile.read();
		count++;
		while(i!=-1)
		{
			toFile.write(i);
			 i= fromFile.read();
			 count++;
			 if(count!=10)
			 {
				 System.out.println("10 characters are copied");
				 Thread.sleep(5000);
				 count=0;
			 }
		}
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	
}
