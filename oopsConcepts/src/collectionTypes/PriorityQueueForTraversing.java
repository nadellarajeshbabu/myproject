package collectionTypes;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class PriorityQueueForTraversing {

public static void main(String[] args) {
		
		PriorityQueue a=new PriorityQueue();
		
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
		
		
		////Forward traversing using ListIterator technique......
		
		////meaning == The method listIterator() is undefined for the type PriorityQueue
		//// ListIterator is a raw type. References to generic type ListIterator<E> should be parameterized....
		 
	
///PriorityQueue Traversing is possible for character data type using Iterator only 
	}
}
