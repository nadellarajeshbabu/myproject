

package collectionPrograms;

import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Scanner;

public class List_IteratorBidirectional 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		ArrayList a=new ArrayList();
		int sta=0;
		do 
		{
			System.out.println("Enter the Integer element:");
			a.add(scan.nextInt());
			System.out.println("Press 1 to cont/0 to stop........");
			sta =scan.nextInt();
		}while(sta==1);
		
		//logic is for Bi-directional traversing/.../.. 
		ListIterator i1= a.listIterator();
		System.out.println("Forward traversing");
		while(i1.hasNext())
		{
			Object o=i1.next();
			System.out.println(o);
		}
		
		System.out.println("Reverse traversing");
		while(i1.hasPrevious())
		{
			Object o=i1.previous();
			System.out.println(o);
		}
	}

}
