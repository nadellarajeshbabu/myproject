package collectionPrograms;

import java.util.ArrayList;

public class Collection_Methods 
{
	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		a1.add(45);
		a1.add(53);
		a1.add(432);
		a1.add(7);
		a1.add(54);
		System.out.println(a1);
		a1.add(2,1);
		System.out.println(a1);
		a1.set(4, 9);
		System.out.println(a1);
		int x=a1.size();
		System.out.println(x);
		a1.remove(0);
		System.out.println(a1);
		int y=a1.size();
		System.out.println(y);
		boolean b1=a1.contains(75);
		boolean b2=a1.contains(432);
		System.out.println(b1);
		System.out.println(b2);
		boolean b3=a1.isEmpty();
		System.out.println(b3);
		a1.clear();
		boolean b4=a1.isEmpty();
		System.out.println(b4);
		System.out.println(a1);
	}

}
