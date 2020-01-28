package encapsulate;

public class Employee 
{
	private int  id;
	private String name;
	private int yoe;
	
	
	public Employee(int id, String name, int yoe) 
	{
		super();
		this.id = id;
		this.name = name;
		this.yoe = yoe;
	}


	@Override
	public String toString() {
		return "Employee [id=" + this.id + ", name=" + this.name + ", yoe=" + this.yoe + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id)
	{
		if(id>100 && id<999)
		{
			this.id = id;
		}
		else
		{
			System.out.println("Invalid ID");
		}
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getYoe() 
	{
		return yoe;
	}


	public void setYoe(int yoe) 
	{
		if(yoe>2 && yoe<6)
		{
			this.yoe=yoe;
		}
		else
		{
			System.out.println("Invalid Experience");
		}
	}
}
