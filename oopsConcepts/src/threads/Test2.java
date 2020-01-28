package threads;

public class Test2 
{
	public static void main(String[] args) {
		
		CommonResource cr=new CommonResource();
		Resource1 r1=new Resource1(cr);
		Resource2 r2=new Resource2(cr);
		r1.start();
		r2.start();
	}

}
//Here Has-A relationship is also maintained.....
//Creating a reference variable in another class as a non-static variable is called as Has-A relationship....
//Here In general If an object is allowing multiple threads to access at a same point of time is called as NotThreadSafeObject.
//If an Object is allowing only one thread to access at a same time is called as ThreadSafeObject..
//In order to convert NotThreadSafeObject to ThreadSafeObject use synchronized keyword before the method signature ...
//Then there exists a proper communication in between the methods to get synchronize.
//This process is called as Synchronization..