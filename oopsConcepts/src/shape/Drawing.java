package shape;

public class Drawing
{
	public static void main(String[] args)
	{
		disArea(new Circle(5));
		disArea(new Triangle(3,4));
		disArea(new Rectangle(2,3));
	}
	public static void disArea(Draw d)
	{
		d.findArea();
		
	}

}
