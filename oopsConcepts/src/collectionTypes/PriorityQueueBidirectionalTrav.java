package collectionTypes;

import java.util.ListIterator;
import java.util.PriorityQueue;

public class PriorityQueueBidirectionalTrav 
{
	public static void main(String[] args) 
	{
	
		PriorityQueue a=new PriorityQueue();
		a.add("raj");
		a.add("Ravi");
		a.add("raju");
		a.add("seenu");
		a.add("Dharani");
		
		
		///BiDirectional is not possible in PriorityQueue Collection....
		
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
