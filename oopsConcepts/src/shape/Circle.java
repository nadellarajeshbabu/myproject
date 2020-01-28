package shape;

public class Circle implements Draw
{
	final static double pi=3.14;
	int radius;
	double area;
	public void findArea()
	{
		this.area=this.radius*this.radius*pi;
		System.out.println("Area of Circle :"+this.area);
	}
	public Circle(int radius)
	{
		this.radius=radius;
	}
}
