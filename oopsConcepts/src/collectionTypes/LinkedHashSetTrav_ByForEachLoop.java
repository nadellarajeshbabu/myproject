package collectionTypes;

import java.util.LinkedHashSet;

public class LinkedHashSetTrav_ByForEachLoop
{

	public static void main(String[] args) {
		LinkedHashSet a=new LinkedHashSet();
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
