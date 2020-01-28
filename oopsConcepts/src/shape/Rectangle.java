package shape;

public class Rectangle implements Draw
{
	int length;
	int breadth;
	double area;
	public void findArea()
	{
		this.area=this.length*this.breadth;
		System.out.println("Area of Rectangle :"+this.area);
	}
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
}
