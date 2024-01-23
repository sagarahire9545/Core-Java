package collection_learning;
import java.util.*;

public class ArrayList1 {

	public static void main(String[] args)
	{
		List<String> fruits=new ArrayList<>(1000);
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Khajur");
		fruits.add("Mango");
		fruits.add("Coconut");
		fruits.add(0, "Chiku");
		
		List<String> animals=new ArrayList<>(fruits);
		
		animals.add("Buffalo");
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Mokey");
		animals.add("Kolha");
		
		
		for(String x:animals)
		{
			System.out.println(x);
		}
		System.out.println("-------------");
		System.out.println(animals.get(5));

	}

}
