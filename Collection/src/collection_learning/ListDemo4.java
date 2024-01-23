package collection_learning;
import java.util.*;

import java.util.List;

public class ListDemo4 {

	public static void main(String[] args) 
	{
		ArrayList<String> str1=new ArrayList(List.of("A","B","C","D","E","F","G","H"));
		
		str1.add("I");
		str1.add("J");
		str1.add(0, "Z");
		str1.set(1, "b");
		
		
		for(String x:str1)
			System.out.println(x);
		System.out.println("_______________________________");
		
		System.out.println(str1.get(0));
		
		System.out.println(str1.indexOf("E"));
		System.out.println(str1.get(2));
		
		str1.remove(5);
		System.out.println(str1);

	}

}
