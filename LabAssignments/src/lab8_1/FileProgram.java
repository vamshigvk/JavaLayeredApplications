package lab8_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileProgram {

	public static void main(String[] args) throws FileNotFoundException
	{
		FileInputStream fromFile = new FileInputStream("C:\\temp\\Greetings.java");
		FileOutputStream toFile = new FileOutputStream("C:\\temp\\StoryTeller.txt");
		
		CopyDataThread copyFileThread = new CopyDataThread(fromFile, toFile);
		copyFileThread.start();
	}

}
