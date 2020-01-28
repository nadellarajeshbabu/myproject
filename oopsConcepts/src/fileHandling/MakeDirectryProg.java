package fileHandling;

import java.io.File;

public class MakeDirectryProg
{
	public static void main(String[] args) 
	{
		File f1=new File("F:/fileoperation");
		boolean status=f1.mkdir();
		System.out.println(status);
		
	}

}
