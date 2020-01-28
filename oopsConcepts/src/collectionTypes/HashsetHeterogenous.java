package collectionTypes;

import java.util.HashSet;

public class HashsetHeterogenous 
{
	public static void main(String[] args) {
		
		HashSet a=new HashSet();
		a.add(1.2);
		a.add('%');
		a.add("Rsj");
		a.add(true);
		a.add(1);
		System.out.println(a);
	}
	//order of Hashset is [int,double,char,string,boolean] 
	/////HashSet is also allows the all heterogenous data types.....
}
