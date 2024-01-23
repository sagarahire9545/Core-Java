package LinkedList;
import java.util.*;

public class RetrivingLinkedL {

	public static void main(String[] args)
	{
		LinkedList<String> students=new LinkedList<>();
		students.add("Sagar");
		students.add("Anil");
		students.add("Ghanashyam");
		students.add("Swapnil");
		students.add("Sachin");
		
		//Getting first element in list
		String firtselement=students.getFirst();
		System.out.println("Getting first element:"+firtselement);
		
		//getting Last element
		String lastelement=students.getLast();
		System.out.println("Getting Last elments:"+lastelement);
		
		//getting elements at the specific position
		String searchelement=students.get(4);
		System.out.println("Getting 4th positon elements:"+searchelement);
		
		// All elements shows
		for(String stud:students)
		{
			System.out.println(stud);
		}
		
		

	}

}
