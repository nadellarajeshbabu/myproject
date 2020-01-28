package threads;

public class CommonResource 
{
	synchronized public void move()
	{
		System.out.println("In move method...");
	}
	synchronized public void fly()
	{
		System.out.println("In fly method...");
	}

}
