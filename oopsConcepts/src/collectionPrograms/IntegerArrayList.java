package collectionPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerArrayList 
{
	static int n;
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		ArrayList a=new ArrayList();
		System.out.println("To add elements press 1");
		System.out.println("to stop press 2");
		while(n==1 || n==0)
		{
			n=scan.nextInt();
			switch(n)
			{
			case 1:
					System.out.println("Enter integer elements only");
					Integer i=scan.nextInt();
					boolean b=a.contains(i);
					if(b==false)
					{
						a.add(i);
					}
					break;
			}
			if(n==0)
			{
				System.out.println(a);
				System.exit(1);
			}			
		}
	}
}
