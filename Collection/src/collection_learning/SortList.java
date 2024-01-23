package collection_learning;
import java.util.*;

public class SortList {

	public static void main(String[] args) 
	{
       List<Integer> list=new ArrayList<>();
       
       list.add(20);
       list.add(30);
       list.add(50);
       list.add(90);
       list.add(10);
       list.add(40);
       list.add(80);
       
       // Ascending ordered
       Collections.sort(list);
       System.out.println(list);
		
       // Descending ordered
       Collections.reverse(list);
       System.out.println(list);
	}

}
