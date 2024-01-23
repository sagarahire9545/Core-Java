package collection_learning;
import java.util.*;


public class ColleDemo1 {

	public static void main(String[] args) 
	{
		Collection<String> collectionFriuts=new ArrayList<>();
		
		 collectionFriuts.add("banana");
		 collectionFriuts.add("apple");
		 collectionFriuts.add("mango");
		 collectionFriuts.add("lemon");
		 
		 collectionFriuts.add("khajur");
		 
		 // collectionFriuts.forEach(fruits->System.out.println(fruits));
		 
		 for(String x: collectionFriuts)
		 {
			 System.out.println(x);
		 }
		 
		 
		 System.out.println(collectionFriuts.contains("mango"));
		 System.out.println(collectionFriuts.size());

	}

}
