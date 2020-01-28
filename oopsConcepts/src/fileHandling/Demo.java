package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Main Starts");
		File f=new File("F:/fileoperation/sample.txt");
		FileWriter fw=new FileWriter(f);
		Scanner scan =new Scanner(System.in);
		System.out.println("Write a Sentence");
		fw.write(scan.nextLine());
		fw.flush();
		fw.close();
		System.out.println("main ends");		
	}

}
