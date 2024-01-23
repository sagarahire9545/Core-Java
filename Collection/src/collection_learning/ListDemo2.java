package collection_learning;
import java.util.*;

public class ListDemo2 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al1=new ArrayList(20);
		ArrayList<Integer> al2=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
		
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		al1.add(0, 5);
		
		al1.addAll(0,al2);
		
		al1.forEach(System.out::println);
		
		// al1.forEach(n->System.out.println(n));
		
		/*
		ListIterator<Integer> it=al1.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
				
				*/
		
		/*
		for(int i=0;i<=al1.size();i++)
		{
			System.out.println(al1.get(i));
		}
		*/
		
		
		/*
		for(Integer x:al1)
		{
			System.out.println(x);
		}
		*/
	}

}
