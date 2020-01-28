package fileHandling;

import java.io.File;
import java.io.FileReader;

public class SampleRead 
{
	public static void main(String[] args) throws Exception
	{
		File f=new File("F:/fileoperation/data.txt");
		FileReader fr=new FileReader(f);
		char[] ch=new char[(int)f.length()];
		fr.read(ch);
		for(char c:ch)
		{
			System.out.println(c);
		}
		
	}
}

///length() in File returns the long data value.But by using read() returns long.So convert it to int because char can take int only......