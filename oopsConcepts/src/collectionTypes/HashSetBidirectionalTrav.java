package collectionTypes;

import java.util.HashSet;
import java.util.ListIterator;

public class HashSetBidirectionalTrav 
{
	public static void main(String[] args) 
	{
	
		HashSet a=new HashSet();
		a.add("raj");
		a.add("Ravi");
		a.add("raju");
		a.add("seenu");
		a.add("Dharani");
		
		///BIdirectional traversing is not possible in HashSet Collection...... 
		
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
