package collection_learning;
import java.util.*;
public class ListDemo3 {

	public static void main(String[] args) 
	{
		ArrayList<String> str=new ArrayList<>();
		
		str.add("Sagar");
		str.add("Sachin");
		str.add("Shamshad");
		str.add("Prashant");
		str.add("Naru");
		str.add(0, "Anil");
		
		System.out.println(str.get(2));
	        System.out.println("Before operations:");
		System.out.println(str);
		 
		System.out.println("After operations:...");
		
		str.remove(3);
		System.out.println(str);
		
		str.remove("Sachin");
		System.out.println(str);
		
		str.set(2, "Rudra");
		System.out.println(str);
		
		

		
		
		/*
		for(String x:str)
		{
			System.out.println(x);
		}
		*/
		// str.forEach(System.out::println);
	}

}
