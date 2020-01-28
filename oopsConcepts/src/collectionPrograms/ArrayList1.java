package collectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList1 
{
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		ArrayList a=new ArrayList();
		int sta=0;
		do
		{
			System.out.println("Enter the double element");
			a.add(scan.nextDouble());
			System.out.println("Press 1 to cont....");
			System.out.println("Press 0 to stop....");
			sta =scan.nextInt();
		}while(sta==1);
		Iterator i1=a.iterator();
		while(i1.hasNext())
		{
			Object rv=i1.next();
			System.out.println(rv);
		}
	}

}
