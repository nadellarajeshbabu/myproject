package methodOverloading1;

public class Addition
{
	public static void add(int a,double b)
	{
		System.out.println(a+b);
		
	}
	
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void add(double a,double b)
	{
		System.out.println(a+b);
	}
	public static void add(int i,int a,double b)
	{
		System.out.println(i+a+b);
		
	}

}
