package encapsulate;

import java.util.Scanner;

import userDefinedException.EmployeeDetailsException;

public class Company
{
	static int i;
	static String name;
	static int y;
	public static void main(String[] args)
	{
		
		Scanner scan =new Scanner(System.in);
		Employee e=new Employee(324,"rajesh",4);
		while(true)
		{
			try
			{
				System.out.println("Enter ID value must be in between 100 and 999");
				e.setId(scan.nextInt(i));
				System.out.println("Enter your name");
				e.setName(scan.next(name));
				System.out.println("Enter Experience ");
				e.setYoe(scan.nextInt(y));
				break;
			}
			catch(EmployeeDetailsException rv)
			{
				System.out.println("Please Enter the Details as per Company requirement");
				throw new EmployeeDetailsException();
			}
		}
	}	
}
