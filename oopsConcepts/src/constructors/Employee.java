package constructors;

public class Employee 
{
	String name;
	int id;
	double salary;
	public Employee(String name, int id, double salary) 
	{
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void info()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Id: "+this.id);
		System.out.println("Salary: "+this.salary);
	}
}
