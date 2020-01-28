package threads;

public class Test1 
{
	public static void main(String[] args) 
	{
		Demo1 d1=new Demo1();
		Sample1 s=new Sample1();
		Thread t1=new Thread(d1);
		Thread t2 =new Thread(s);
		t1.start();
		t2.start();
		
	}
///In this program we are creating thread using Runnable interface...But in Runnable interface There is only one method
//i.e.. run()... no start method is present.
///to run the thread we need start().
///so BY passing the runnable type object to the Thread which means that Thread has two methods required to create and run the thread... 

}
