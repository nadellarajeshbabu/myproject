package collectionTypes;

import java.util.HashSet;

public class HashSetTrav_ByForEachLoop {

	public static void main(String[] args) {
		HashSet a=new HashSet();
		a.add(100);
		a.add(2);
		a.add(3);
		a.add(34);
		a.add(23);

		for(Object o:a)
		{
			System.out.println(o);
		}
		
	}

}
