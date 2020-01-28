package generalisationMethod;

public class Triangle extends Shape
{
	int l;
	double b;
	double area;
	public Triangle(int l,double b)
	{
		this.l=l;
		this.b=b;
	}
	public void getArea()
	{
		this.area=this.l*this.b*0.5;
		System.out.println("Area of Triangle: "+this.area);
	}

}
