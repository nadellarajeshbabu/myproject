package exceptions;

public class UncheckedException 
{
	public static void main(String[] args) {
		
		try
		{
			display();
			
		}
		catch(InterruptedException r)
		{
			System.out.println("Exception caugh");
		}
	}
	public static void display()throws InterruptedException
	{
		System.out.println("main starts");
		Thread.sleep(3000);
		System.out.println("Main ends ");
	}


}
