package collectionProperties;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class HashSetProperties 
{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		HashSet a=new HashSet();
		int status =0;
		do 
		{
			System.out.println("Press 1 to add Integer elements:");
			System.out.println("Press 2 to add Double elements:");
			System.out.println("Press 3 to add character elements:");
			System.out.println("Press 4 to add String elements:");
			System.out.println("Press 5 to add Boolean elements:");
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Enter Integer element: ");
					a.add(scan.nextInt());
					break;
			case 2:System.out.println("Enter the Double element: ");
					a.add(scan.nextDouble());
					break;
			case 3:System.out.println("Enter the Character element: ");
					a.add(scan.next().charAt(0));
					break;
			case 4:System.out.println("Enter the String element: ");
					a.add(scan.next());
					break;
			case 5:System.out.println("Enter the Boolean element:");
					a.add(scan.nextBoolean());
					break;
			default:System.out.println("You have choosen wrong option: "); 
			}
			System.out.println("Press 1 to continue....");
			System.out.println("Press 0 to stop.....");
			status=scan.nextInt();
		}while(status==1);
		
		Iterator i=a.iterator();
		
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(o);
		}
		
		 System.out.println("Bidirectional Traversing.....");
		 /*ListIterator l=a.listIterator();
		 System.out.println("Forward  traversing.....");
		 while(l.hasNext())
		 {
			 Object o1=l.next();
			 System.out.println(o1);
		 }
		 System.out.println("Reverse traversing....");
		 while(l.hasPrevious())
		 {
			 Object o1=l.previous();
			 System.out.println(o1);
		 }*/
		 scan.close();
	}


}
