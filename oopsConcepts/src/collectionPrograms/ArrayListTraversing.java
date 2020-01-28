package collectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListTraversing
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
		
		//traversing and removing the searchElement in arraylist is the logic ....
		System.out.println("Enter the integer to remove from list:");
		int searchEle=scan.nextInt();
		
		System.out.println("Elements before remove:");
		System.out.println(a);
		
		if(a.contains(searchEle))
		{
			Iterator i1=a.iterator();
			while(i1.hasNext())
			{
				Object o=i1.next();			
				Integer rv=(Integer)o;
				int receivedEle=rv.intValue();
				if(receivedEle==searchEle)
				{
					i1.remove();
				}
			}
		}
		else
		{
			System.out.println("Element not found");
		}
		System.out.println("Elements after removal of "+searchEle);
		System.out.println(a);
	}
}
