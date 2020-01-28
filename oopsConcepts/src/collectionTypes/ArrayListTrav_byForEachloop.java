package collectionTypes;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTrav_byForEachloop 
{
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(43);
		a.add(34);
		a.add(23);

		for(Object o:a)
		{
			System.out.println(o);
		}
		
	}

}
