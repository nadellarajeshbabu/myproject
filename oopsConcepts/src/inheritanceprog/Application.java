package inheritanceprog;
import constructors.*;

public class Application 
{
	public static void main(String[] args)
	{
		Developer d=new Developer("Rajesh",214,25000,"java");
		d.devInfo();
		System.out.println("==============");
		TestEngg t=new TestEngg("Ravi",1243,23000,"ETL testing");
		t.testEnggInfo();

	}

}
