package threads;

public class Volleyball 
{
	synchronized public void pass()
	{
		System.out.println("Ball is passed....");
		notifyAll();
	}
	synchronized public void smash()
	{
		try
		{
			wait(5000);
		}
		catch(InterruptedException rv)
		{
		}
		System.out.println("Ball is Smashed....");
	}
	synchronized public void lift()
	{
		try
		{
			wait();
		}
		catch(InterruptedException rv)
		{	
		}
		System.out.println("Ball is Lifted...");
	}	
}
