package exceptions;

import java.util.Scanner;

public class CheckedException 
{
	static int i;
	static int j;
	public static void main(String[] args) 
	{	
		Scanner scan =new Scanner(System.in);
		
		System.out.println("main starts");
		while(true)
		{
			try
			{
				System.out.println("Enter the integer");
				i=scan.nextInt();
				System.out.println("Enter the integer");
				j=scan.nextInt();
				
				division(i,j);
				break;
				
			}
			catch(ArithmeticException r)
			{
				System.out.println("You entered "+j+" as Denominator input ");
				System.out.println("Except "+j+" you can enter any number. So Try again");
			}
		}
		System.out.println("Main ends");
	}
	public static void division(int i,int j)
	{
		
		System.out.println("In division...");
		int res=i/j;
		System.out.println(res);
	}

}
