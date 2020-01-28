package collectionTypes;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSetForTraversing
{

	public static void main(String[] args) {
		
		TreeSet a=new TreeSet();
		a.add('t');
		a.add('z');
		a.add('a');
		a.add('w');
		a.add('r');
		a.add('q');
		a.add('s');
		
		
		///Forward traversing using Iterator technique
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			Object o= i.next();
			System.out.println(o);
		}
		
		/////IN Treeset traversing of characters is done in ascending order.....
		////Forward traversing using ListIterator technique......
		/*
		 * ListIterator is a raw type. References to generic type ListIterator<E> should be  parameterized 
		 * 	The method listIterator() is undefined for the type LinkedHashSet
		 */
		/// TreeSetTraversing is possible for character data type....
	}
}

