package fileHandling;

public class Student 
{
	int id;
	String name;
	double marks;
	public Student(int id, String name, double marks) 
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public void display()
	{
		System.out.println("Student details");
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
		System.out.println("Marks : "+this.marks);
	}
}
