package threads;

public class Sample1 implements Runnable 
{
	public void fly()
	{
		System.out.println("In fly method....");
	}
	public void run()
	{
		this.fly();
	}

}
