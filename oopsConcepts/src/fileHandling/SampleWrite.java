package fileHandling;

import java.io.File;
import java.io.FileWriter;

public class SampleWrite
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Main Starts");
		File f=new File("F:/fileoperation/data.txt");
		f.createNewFile();
		FileWriter fw=new FileWriter(f);
		fw.write("Java\r\n");
		fw.write("Sql\r\n");
		fw.write("html");
		fw.flush();
		fw.close();
		System.out.println("Main Ends ");
	}

}
