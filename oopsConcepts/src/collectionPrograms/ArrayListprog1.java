package collectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;

///As a Wrapper classes are turned as implicit from jdk1.5 noneed to call  
public class ArrayListprog1 
{
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add(45);
		a.add(4.4);
		a.add('@');
		Iterator i1=a.iterator();
		while(i1.hasNext())
		{
			Object o=i1.next();
			System.out.println(o);
		}
	}
}
