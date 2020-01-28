package collectionTypes;

import java.util.PriorityQueue;

public class PriorityQueueForEachLoop 
{
	public static void main(String[] args) 
	{
		PriorityQueue a=new PriorityQueue();
		a.add(1);
		a.add(23);
		a.add(34);
		a.add(56);
		a.add(76);
		
		for(Object o:a)
		{
			System.out.println(o);
		}
		

	}

}
