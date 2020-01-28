package collectionTypes;

import java.util.LinkedList;

public class LinkedListTrav_ByGetMet 
{
	public static void main(String[] args) {
		LinkedList a =new LinkedList();
		
		a.add(3.1);
		a.add(2.4);
		a.add(4.5);
		a.add(6.5);
	
		for(int i=0;i<=a.size()-1;i++)
		{
			Object o=a.get(i);
			System.out.println(o);
		}
		
	}

}
