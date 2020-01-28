package threads;

public class Player1 extends Thread
{
	Volleyball vb;
	public Player1(Volleyball vb)
	{
		this.vb =vb;
	}
	public void jump()
	{
		vb.smash();
	}
	@Override 
	public void run()
	{
		this.jump();
	}

}
