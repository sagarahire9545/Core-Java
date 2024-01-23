package LinkedList;

import java.util.LinkedList;

public class RemovingElementsLinkedL {

	public static void main(String[] args) 
	{
		LinkedList<String> students=new LinkedList<>();
		students.add("Sagar");
		students.add("Anil");
		students.add("Ghanashyam");
		students.add("Swapnil");
		students.add("Sachin");
		
		// Initial List
		System.out.println("Initial Lis:"+students);
		// Removing first element
		students.removeFirst();
		System.out.println("Remove first element:"+students);
		
		// Removing last element
		students.removeLast();
		System.out.println("Remove last element:"+students);
		
		// Removing element at the specific position
		students.remove(2);
		System.out.println("Remove first element:"+students);
		
		//Removing all elements
		students.removeAll(students);
		System.out.println("Removing all elements...."+students);
	}

}
