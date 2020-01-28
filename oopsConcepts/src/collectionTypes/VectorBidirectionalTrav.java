package collectionTypes;

import java.util.ListIterator;
import java.util.Vector;

public class VectorBidirectionalTrav 
{
	public static void main(String[] args) 
	{
	
		Vector a=new Vector();
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
