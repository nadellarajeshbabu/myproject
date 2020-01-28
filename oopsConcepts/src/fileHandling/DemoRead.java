package fileHandling;

import java.io.File;
import java.io.FileReader;

public class DemoRead 
{
	public static void main(String[] args) throws Exception
	{
		int count=0;
		int sum=0;
		File f=new File("F:/fileoperation/sample.txt");
		FileReader fr=new FileReader(f);
		char[] ch=new char[(int)f.length()];
		fr.read(ch);
		for(char c:ch)
		{
			if(c!=' ')
			{
				count=1;
			}
			else
			{
				sum=sum+count;
			}
		}
		for(char c1:ch)
		{
			System.out.println(c1);
		}
		System.out.println(sum+1);
		
	}
	

}
