package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationProgStudent 
{
	public static void main(String[] args) throws Exception
	{
		File f=new File("F:/fileoperation/Student.ser");
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois =new  ObjectInputStream(fis);
		Student rv=(Student)ois.readObject();
		rv.display();
		ois.close();
		fis.close();		
	}
}

///
