package collectionTypes;

import java.util.TreeSet;

public class TreeSetTrav_ByForEachLoop 
{
	public static void main(String[] args) {
		TreeSet a=new TreeSet();
		a.add(2);
		a.add(23);
		a.add(34);
		a.add(45);
		a.add(56);
		
		for(Object o:a)
		{
			System.out.println(o);
		}

	}

}
