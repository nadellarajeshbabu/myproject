package constructorProg;

public class Developer extends Employee 
{
	String language;

	public Developer(String name, int id, double salary, String language)
	{
		super(name, id, salary);
		this.language = language;
	}
	public void devInfo()
	{
		System.out.println("Developer details:");
		this.info();
		System.out.println("Language: "+this.language);
	}
}
