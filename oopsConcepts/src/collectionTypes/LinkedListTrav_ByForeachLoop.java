package collectionTypes;

import java.util.LinkedList;

public class LinkedListTrav_ByForeachLoop {

	public static void main(String[] args) {
		LinkedList a=new LinkedList();
		a.add(1);
		a.add(2);
		a.add(43);
		a.add(34);
		a.add(23);

		for(Object o:a)
		{
			System.out.println(o);
		}
		
	}

}
