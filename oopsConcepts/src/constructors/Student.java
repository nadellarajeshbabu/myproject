package constructors;

public  class Student
{
	String name;
	int id;
	double tenth_per;
	double inter_per;
	double degree_per;
	double masters_per;
	public  Student(String name,int id,double tenth_per,double inter_per,double degree_per)
	{
		super();
		this.name=name;
		this.id=id;
		this.tenth_per=tenth_per;
		this.inter_per=inter_per;
		this.degree_per=degree_per;

	}
	public  Student(String name,int id,double tenth_per,double inter_per,double degree_per,double masters_per)
	{
		this(name,id,tenth_per,inter_per,degree_per);
		this.masters_per=masters_per;
	}
	public void studentInfo()
	{
		System.out.println("Student information");
		System.out.println("Student Name: "+this.name);
		System.out.println("Id: "+this.id);
		System.out.println("Tenth Percentage: "+this.tenth_per);
		System.out.println("Inter Percentage: "+this.inter_per);
		System.out.println("Degree Percentage: "+this.degree_per);
		if(masters_per!=0)
		{
			System.out.println("Masters Percentage: "+this.masters_per);
		}
	}
}
