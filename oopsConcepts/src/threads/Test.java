package threads;

public class Test 
{
	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		Demo d1=new Demo();
		s1.start();
		d1.start();
	}
}

