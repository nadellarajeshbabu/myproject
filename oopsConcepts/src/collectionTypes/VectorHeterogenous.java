package collectionTypes;

import java.util.Vector;

public class VectorHeterogenous 
{
	public static void main(String[] args) {
		
		Vector v=new Vector();
		v.add(1);
		v.add(1.2);
		v.add('@');
		v.add("rajesh");
		v.add(true);
		System.out.println(v);
	}
	////Vector also allows all heterogenous data types....
}
