package inheritance;

public class Triangle extends Area 
{
	final static double half=0.5;
	int base;
	int height;
	double area;
	public void findArea()
	{
		this.area=this.base*this.height*half;
		System.out.println("Area of Triangle :"+this.area);
	}
	public Triangle(int base,int height)
	{
		this.base=base;
		this.height=height;
	}

}
