package fileHandling;

import java.io.File;

public class CreateNewFileProg 
{
	public static void main(String[] args) 
	{
		
		File f1=new File("F:/fileoperation/Student.ser");
		try
		{
			boolean sta=f1.createNewFile();
			System.out.println(sta);
		}
		catch(Exception r)
		{
			System.out.println("Exception is caught...");
		}
	}

}
