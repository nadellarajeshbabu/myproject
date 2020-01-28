package threads;

public class Resource2 extends Thread
{
	CommonResource cr2;
	public Resource2(CommonResource cr2)
	{
		this.cr2=cr2;
	}
	public void run()
	{
		cr2.fly();
				
	}

}
