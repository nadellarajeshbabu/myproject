package collectionTypes;

import java.util.ArrayList;

public class ArrayListTrav_ByGetMet
{
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		
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
