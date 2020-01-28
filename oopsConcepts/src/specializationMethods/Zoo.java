package specializationMethods;


//specialized methods will have argument of Implementation class reference variable.
public class Zoo 
{
	public static void main(String[] args)
	{
		makeSound(new Lion());
		makeSound(new Tiger());
	}
	
	// below method is a specialized method,only for Lion type
	public static void makeSound(Lion rv)
	{
		rv.noise();
	}
	
	// below method is a specialized method,only for the Tiger type
	public static void makeSound(Tiger rv)
	{
		rv.noise();
	}
}
