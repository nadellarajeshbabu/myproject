package threads;

public class Resource1 extends Thread
{
	CommonResource cr1;
	public Resource1(CommonResource cr1)
	{
		this.cr1=cr1;
	}
	public void run()
	{
		cr1.move();
	}
}
