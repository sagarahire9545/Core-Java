package collection_learning;
import java.util.*;
public class ListDemo {

	public static void main(String[] args)
	{
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<>(List.of(2,3,4,5,6,7,8,9));
		
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(0,5);
		
		al1.addAll(0,al2);
		
		// checking value in array
		System.out.println(al1.contains(20));
		
		// print the positional no
		System.out.println(al1.get(5));
		
		System.out.println(al1.indexOf(4));
		System.out.println(al1.set(0, 1));

		System.out.println(al1);
	}

}
