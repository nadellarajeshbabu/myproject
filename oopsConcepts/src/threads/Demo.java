package threads;

public class Demo extends Thread
{
	public void fly()
	{
		System.out.println("In fly ....");
	}
	public void run()
	{
		this.fly();
	}

}
