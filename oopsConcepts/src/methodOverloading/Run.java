package methodOverloading;

public class Run {

	public static void test(int a)
	{
		System.out.println("In test int arg...");
	}
	public static void test(int a,double b)
	{
		System.out.println("In test int,double arg...");
	}
	public static void test(int a,double c,char d)
	{
		System.out.println("In test int,double,char arg...");		
	}
}
