package inheritance;

public class Drawing 
{
	public static void main(String[] args)
	{
	Circle c1=new Circle(10);
	Rectangle r1=new Rectangle(10,20);
	Triangle t1= new Triangle(8,9);
	c1.findArea();
	t1.findArea();
	r1.findArea();
	}
}
