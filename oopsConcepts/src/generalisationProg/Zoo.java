 package generalisationProg;

import specializationMethods.Animal;

public class Zoo
{
	public static void main(String[] a)
	{
		makeSound(new Tiger());
		makeSound(new Lion());
	}
	public static void makeSound(Animal a)
	{
		a.noise();
	}

}
