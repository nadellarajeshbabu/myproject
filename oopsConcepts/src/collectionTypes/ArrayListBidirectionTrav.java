 package collectionTypes;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListBidirectionTrav 
{

	public static void main(String[] args) 
	{
	
		ArrayList a=new ArrayList();
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
