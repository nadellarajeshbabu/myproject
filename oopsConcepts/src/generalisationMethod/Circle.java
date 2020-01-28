package generalisationMethod;

public class Circle extends Shape
{
	int r;
	double area;
	public Circle(int r)
	{
		this.r=r;
	}

	public void getArea() 
	{
		area=3.14*this.r*this.r;
		System.out.println("Area of a Circle: "+this.area);
		
	}

}
