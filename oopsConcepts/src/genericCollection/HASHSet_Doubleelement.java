package genericCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
public class HASHSet_Doubleelement 
{
	public static void main(String[] args) {
		
		HashSet<Double> h=new HashSet<Double>();
		h.add(1.3);
		h.add(1.4);
		h.add(4.2);
		h.add(5.6);
		h.add(6.7);
		
		Iterator<Double> i1=h.iterator();
		while(i1.hasNext())
		{
			Double d=i1.next();
			System.out.println(d);
			
		}
		//ListIterator<Double> i1= h.listIterator();
		
		//ListIterator<Double> l=h.listIterator();
		///traversing in HashSet collection is not possible by ListIterator
		
	}

}
