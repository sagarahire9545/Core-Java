package collection_learning;
import java.util.*;

public class ArrayListMethods {

	public static void main(String[] args) 
	{
		List<String> topProgrammingLanguages = new ArrayList<>();
		
		System.out.println("The arraylist is empty:"+topProgrammingLanguages.isEmpty());
		
		topProgrammingLanguages.add("Java");
		topProgrammingLanguages.add("Php");
		topProgrammingLanguages.add(".net");
		topProgrammingLanguages.add("C");
		topProgrammingLanguages.add("JavaScript");
		topProgrammingLanguages.add("c#");
		
		
		System.out.println("Here the size:"+topProgrammingLanguages.size());
		
		String bestProLang=topProgrammingLanguages.get(0);
		System.out.println("Top lang:"+bestProLang);
		
		String secondProLang=topProgrammingLanguages.get(2);
		System.out.println("Secong best Pro Lnag:"+secondProLang);
		
		System.out.println("Set the index of language:"+topProgrammingLanguages.set(5, "c++"));

		System.out.println("----------------------------");
		for(String x:topProgrammingLanguages)
		{
			System.out.println(x);
		}
	}

}
