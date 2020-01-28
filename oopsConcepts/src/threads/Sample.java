package threads;

public class Sample extends Thread
{
	public void run()
	{
		this.move();
	}
	public void  move()
	{
		System.out.println("IN move method....");
	}
}
