package constructorProg;

public class Jspiders 
{
	public static void main(String[] args) 
	{
		Student s=new Student("rajesh",1234,93.00,91.00,72.54,70.0);
		s.studentInfo();
		System.out.println();
		Student s1=new Student("rajesh",1234,93.00,91.00,72.54);
		s1.studentInfo();
		
	}
}
