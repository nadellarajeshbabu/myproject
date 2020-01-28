package collectionTypes;

import java.util.LinkedHashSet;

public class LinkedHashSetTrav_ByGetMet
{
	public static void main(String[] args) {
		LinkedHashSet a=new LinkedHashSet();
		
		a.add(3.1);
		a.add(2.4);
		a.add(4.5);
		a.add(6.5);
	
		///In LinkedHashSet there is no get() for Traversing technique.......
		
		/*for(int i=0;i<=a.size()-1;i++)
		{
			Object o=a.get(i);
			System.out.println(o);
		}*/		
	}

}
