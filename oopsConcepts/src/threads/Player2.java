package threads;

public class Player2 extends Thread
{
	Volleyball vb;

	public Player2(Volleyball vb) 
	{	
		this.vb = vb;
	}
	public void turnLeft()
	{
		vb.lift();
	}
	@Override
	public void run()
	{
		this.turnLeft();
	}
	

}
