package objectCasting;

public class Casting_In_Mul_Level_Inh 
{

	public static void main(String[] args) 
	{
		
		// Up-casting from demo2 to demo1. So here for super class(Demo1)can have the properties itself. 
		Demo1 a1=new Demo2();
		a1.t2();
		
		// Up-casting from demo2 to demo1. So here for super class(Demo)can have the properties itself.
		Demo a2=(Demo)a1;
		a2.t1();
		
		// Down-casting from demo to demo1. So here for sub-class(Demo1) can have the properties itself and super-class.
		Demo1 a3=(Demo1)a1;
		a3.t1();
		a3.t2();
		
		// Down-casting from demo1 to demo2. So here for sub-class(Demo2)can have the properties itself and super-class(Demo1)
		Demo2 a4=(Demo2)a3;
		a4.t1();
		a4.t2();
		a4.t3();
	}

}
