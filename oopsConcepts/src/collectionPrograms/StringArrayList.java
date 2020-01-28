package collectionPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayList 
{		
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		ArrayList a= new ArrayList();
		int status=0;
		
		do
		{
			System.out.println("Enter the string element:");
			a.add(scan.next());
			System.out.println("Enter 1 to cont....");
			System.out.println("Enter 0 to stop...");
			status=scan.nextInt();
		}while(status==1);
		System.out.println(a);
		System.out.println("Enter the index number to set String value:");
		int i=scan.nextInt();
		System.out.println("Enter the string:");
		a.set(i, scan.next());
		System.out.println("Elements after the modification: ");
		System.out.println(a);
		}		
	}

