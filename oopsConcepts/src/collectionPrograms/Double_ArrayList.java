package collectionPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class Double_ArrayList
{ 
	static int n;
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		ArrayList a=new ArrayList();
		System.out.println("If U want to continue Press 1 ");
		System.out.println("Press 0 to print output and gets stopped ");
		
		while(n==1||n==0)
		{
			n=scan.nextInt();
			switch(n)
			{
				case 1:
					System.out.println("Enter the Double elements only:");
					Double d1=scan.nextDouble();
					a.add(d1);
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
