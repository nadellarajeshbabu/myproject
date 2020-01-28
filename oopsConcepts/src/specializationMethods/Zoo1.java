package specializationMethods;

//Generalization methods will have argument of interface reference variable.
public class Zoo1
{
	public static void main(String[] args)
	{
		
		makeSound(new Lion());
		makeSound(new Tiger());
	}
	public static void makeSound(Animal a1)
	{
		a1.noise();
	}


}
