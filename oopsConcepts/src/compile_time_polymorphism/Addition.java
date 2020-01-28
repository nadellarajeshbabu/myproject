package compile_time_polymorphism;

//call the overloaded static methods can be resolved during compile time based on arguments is called Compile time Polymorphism. 

public class Addition
{
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void add(int a,double b)
	{
		System.out.println(a+b);
	}
	public static void add(double a,double b)
	{
		System.out.println(a+b);
		
	}

}
