package LinkedList;
import java.util.*;

public class LinkedL1 {

	public static void main(String[] args)
	{
		LinkedList<String> fruits=new LinkedList<>();
		
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Apple");
		
		System.out.println("Initial list:"+fruits);
		
		// adding elements at the specific position 
		fruits.add(2, "WaterLemon");
		System.out.println("after adding waterlemon:"+fruits);
		
		// Adding element at the biggining
		
		fruits.addFirst("Strwabery");
		System.out.println("Adding element biginning position:"+fruits);
		
		//Adding element at the last position
		fruits.addLast("Pinaapple");
		System.out.println("Adding element at the last position:"+fruits);
		
		System.out.println("---------------------------------------");
		for(String x:fruits)
		{
			System.out.println(x);
		}
		
		
	}

}
