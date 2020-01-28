package encapsulation;

public class Watch implements ShowRoom
{
	private int hr;
	private int min;
	private int sec;
	
	public Watch(int hr,int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}	
	public void getHr()
	{
		System.out.println("Hours: "+this.hr);
	}
	public void getMin()
	{
		System.out.println("Min: "+this.min);
		
	}
	public void getSec()
	{
		System.out.println("Seconds: "+this.sec);
	
	}
	
	public void setHr(int hr)
	{
		this.hr=hr;
	}
	public void setMin(int min)
	{
		this.min=min;
	}
	public void setSec(int sec)
	{
		this.sec=sec;
	}
	public static void main(String[] args)
	{
		Watch z1=new Watch(10,56,40);
		z1.getHr();
		z1.getMin();
		z1.getSec();
		z1.setHr(11);
		z1.setMin(50);
		z1.setSec(49);
		z1.getHr();
		z1.getMin();
		z1.getSec();
	}
}
