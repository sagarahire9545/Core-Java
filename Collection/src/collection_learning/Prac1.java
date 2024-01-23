package collection_learning;
import java.util.*;

public class Prac1 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al1=new ArrayList<>(List.of(10,20,30,40,50,60,70,80,90));
		
		al1.forEach(System.out::println);
		
		//al1.forEach(n->System.out.println(n));
		
		
		/*
		for(Integer i:al1)
		{
			System.out.println(i);
		}
		*/
		
		
		
		/*
		for(int i=0;i<=al1.size();i++)
		{
			System.out.println(al1.get(i));
		}
		*/
	}

}
