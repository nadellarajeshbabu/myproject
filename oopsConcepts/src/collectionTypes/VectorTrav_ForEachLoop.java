package collectionTypes;

import java.util.Vector;

public class VectorTrav_ForEachLoop 
{
	public static void main(String[] args) {
		Vector a=new Vector();
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
