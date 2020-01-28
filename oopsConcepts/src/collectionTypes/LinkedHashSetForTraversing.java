package collectionTypes;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class LinkedHashSetForTraversing {

public static void main(String[] args) {
		
		LinkedHashSet a=new LinkedHashSet();
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
		
		
		////Forward traversing using ListIterator technique is not possible for LinkedHashSet because of below stated reason.....
		/*
		 * ListIterator is a raw type. References to generic type ListIterator<E> should be  parameterized 
		 * 	The method listIterator() is undefined for the type LinkedHashSet
		 */
		///LinkedHashSet Traversing is possible for character data type using Iterator......
	}
}

