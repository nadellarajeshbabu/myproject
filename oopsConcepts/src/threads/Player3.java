package threads;

public class Player3 extends Thread
{
	Volleyball vb;

	public Player3(Volleyball vb) 
	{
			this.vb = vb;
	}
	@Override
	public void run()
	{
		vb.pass();
	}
	

}
