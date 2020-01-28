package collectionTypes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListForTraversing {

	public static void main(String[] args) {
		
		LinkedList a=new LinkedList();
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
///LinkedList Traversing is possible for character data type....
	}
}
