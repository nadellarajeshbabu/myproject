package collectionTypes;


import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListBidirectionalTrav 
{
	public static void main(String[] args) 
	{
	
		LinkedList a=new LinkedList();
		a.add("raj");
		a.add("Ravi");
		a.add("raju");
		a.add("seenu");
		a.add("Dharani");
		
		ListIterator l=a.listIterator();
		
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
		}
	}

	
}
