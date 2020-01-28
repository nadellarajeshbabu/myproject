package collectionPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class MUltipleData_ArrayList 
{
	static int  n;
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		ArrayList a=new ArrayList();
		int status=0;
		
			do
			{
				System.out.println("Press 1 to add Double element ");
				System.out.println("Press 2 to add Integer element ");
				System.out.println("Press 3 to add String element ");
				System.out.println("Press 4 to add Character element ");
				System.out.println("Press 5 to add Boolean element ");
				System.out.println("Enter your choice: ");
				int n=scan.nextInt();
				switch(n)
				{
					case 1:				
							System.out.println("Enter the Double element:");
							a.add(scan.nextDouble());
							break;
					case 2:	
							System.out.println("Enter the Integer element:");
							a.add(scan.nextInt());
							break;
					case 3:
							System.out.println("Enter the String element:");
							a.add(scan.next());
							break;
					case 4:System.out.println("Enter the character element");
							a.add(scan.next().charAt(0));
							break;
					case 5: System.out.println("Enter the boolean Element: ");
							a.add(scan.nextBoolean());
							break;
					default :System.out.println("You entered wrong option");
				}
				System.out.println("Enter 1 to cont...");
				System.out.println("Enter 0 to stop..." );
				status=scan.nextInt();
			}while(status==1);
			System.out.println(a);
		}
	}


