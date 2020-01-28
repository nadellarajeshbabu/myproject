package collectionTypes;

import java.util.LinkedHashSet;
import java.util.ListIterator;

public class LinkedHashSetBidirectionalTrav 
{
	public static void main(String[] args) 
	{
	
		LinkedHashSet a=new LinkedHashSet();
		a.add("raj");
		a.add("Ravi");
		a.add("raju");
		a.add("seenu");
		a.add("Dharani");
		
		
		///Bidirectional traversing is not possible in LinkedHashSet Collection
		/*ListIterator l=a.listIterator();
		
		while(l.hasNext())
		{
			Object o=l.next();
			System.out.println(o);
		}
		
		System.out.println();
		while(l.hasPrevious())
		{
			Object o=l.previous();
			System.out.println(o);
		}*/
	}

}
