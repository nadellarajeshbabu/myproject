package threads;

public class Demo1 implements Runnable
{
	public void move()
	{
		System.out.println("In move...");
	}
	public void run()
	{
		this.move();
		Thread t1=Thread.currentThread();
		long id=t1.getId();
		String name=t1.getName();
		int priority =t1.getPriority();
		System.out.println(id);
		System.out.println(name);
		System.out.println(priority);
		System.out.println("By default Priority will always be 5 only......");
		t1.setName("Thread 1");
		t1.setPriority(2);
		System.out.println("Before change....");
		long id1=t1.getId();
		String cName=t1.getName();
		int cPriority=t1.getPriority();
	
		System.out.println("After change");
		System.out.println(id1);
		System.out.println(cName);
		System.out.println(cPriority);

	}

}
