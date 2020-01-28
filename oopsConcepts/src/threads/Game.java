package threads;

public class Game 
{
	public static void main(String[] args) 
	{
		Volleyball vb=new Volleyball();
		Player1 p1=new Player1(vb);
		Player2 p2=new Player2(vb);
		Player3 p3=new Player3(vb);
		p2.start();
		p3.start();
		p1.start();
	}

}
