package collectionTypes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayLIstForTraversing {
	
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add('a');
		a.add('w');
		a.add('r');
		a.add('q');
		
		
		///Forward traversing using Iterator technique
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			Object o= i.next();
			System.out.println(o);
		}
		
		
		////Forward traversing using ListIterator technique......
		ListIterator l=a.listIterator();
		while(l.hasNext())
		{
			Object o1=l.next();
			System.out.println(o1);
		}
	}
}
///ArrayList Traversing is possible for character data type....