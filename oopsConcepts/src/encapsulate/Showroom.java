
package encapsulate;

import java.util.Scanner;

import userDefinedException.InvalidTimeException;

public class Showroom 
{
	public static void main(String[] args) 
	{
		int h,m,s;
		Scanner scan=new Scanner(System.in);
		Watch w1=new Watch(23,24,12);
		try
		{
			System.out.println("Enter the hour,min and sec");
			h=scan.nextInt();
			m=scan.nextInt();
			s=scan.nextInt();
			w1.changeTime(h,m,s);
			throw new InvalidTimeException();
			
		}
		catch(InvalidTimeException e)
		{
			
		}
		
		
	}

}
