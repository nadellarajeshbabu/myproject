package collectionTypes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetForwardTraversing {

public static void main(String[] args) {
		
		HashSet a=new HashSet();
		a.add('z');
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
		////Traversing is done in ascending order only.......
		
		////Forward traversing using ListIterator technique is not possible for raw type ......
	}
}
