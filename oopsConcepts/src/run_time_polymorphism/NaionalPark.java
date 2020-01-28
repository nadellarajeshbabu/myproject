package run_time_polymorphism;

////This program is related to Run time polymorphism which means that call to non static methods are over rided during run time based on object creation....   

public class NaionalPark {

	public static void main(String[] args)
	{
		makeSound(new Tiger());
		makeSound(new Lion());
		

	}
	public static void makeSound(Animal a)
	{
		a.noise();	}

}
