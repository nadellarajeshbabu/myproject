package generalisationMethod;

public class Rectangle extends Shape
{
	int b;
	double h;
	double area;
	public Rectangle(int b,double h)
	{
		this.b=b;
		this.h=h;
	}
	
	
	public void getArea()
	{
		this.area=this.h*this.b;
		System.out.println("Area of Rectangle: "+this.area);
	}

}
