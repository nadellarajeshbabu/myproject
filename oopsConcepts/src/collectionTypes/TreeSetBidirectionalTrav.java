package collectionTypes;

import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSetBidirectionalTrav 
{
	public static void main(String[] args) 
	{
	
		TreeSet a=new TreeSet();
		a.add("raj");
		a.add("Ravi");
		a.add("raju");
		a.add("seenu");
		a.add("Dharani");
		
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

	///Bidirectional traversing technique is not possible  in TreeSet collection.......
}
