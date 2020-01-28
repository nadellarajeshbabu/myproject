package constructors;

public class TestEngg extends Employee
{
	String typeoftesting;

	public TestEngg(String name, int id, double salary, String typeoftesting) 
	{
		super(name, id, salary);
		this.typeoftesting = typeoftesting;
	}
	public void testEnggInfo()
	{
		System.out.println("Test Enggineer Details:");
		this.info();
		System.out.println("Type of testing: "+this.typeoftesting);
	}
	


}
