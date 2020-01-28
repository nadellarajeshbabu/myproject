package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationProg
{
	public static void main(String[] args) throws Exception
	{
		Student s1= new Student(45,"rajesh",93.1);
		File f=new File("F:/fileoperation/Student.ser");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		fos.close();
	}
}

///Serialization means  storing the data in a File...