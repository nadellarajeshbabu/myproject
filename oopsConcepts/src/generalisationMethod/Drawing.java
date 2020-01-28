package generalisationMethod;

public class Drawing 
{
	public static void main(String[] args)
	{
		displayArea(new Circle(1));
		displayArea(new Triangle(4,6));
		displayArea(new Rectangle(4,5));
	}
	public static void displayArea(Shape s)
	{
		s.getArea();
	}

}
