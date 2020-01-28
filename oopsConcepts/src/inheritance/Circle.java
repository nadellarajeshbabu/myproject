package inheritance;

public class Circle extends Area
{
	int r;
	double area;
	final double pi=3.14;
	public Circle(int r)
	{
		this.r=r;
	}
	public void findArea()
	{
		this.area=this.r*this.r*pi;
		System.out.println("Area of Circle: "+this.area);
	}

}
