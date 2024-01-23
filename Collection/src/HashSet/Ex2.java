package HashSet;
import java.util.*;
public class Ex2 {

	public static void main(String[] args)
	{
		Set<Integer> firstfiveevennumbers=new HashSet<>();
		
		firstfiveevennumbers.add(2);
		firstfiveevennumbers.add(4);
		firstfiveevennumbers.add(6);
		firstfiveevennumbers.add(8);
		firstfiveevennumbers.add(10);
		//firstfiveevennumbers.add(10); //its not duplicate value

        System.out.println(firstfiveevennumbers);
	
		Set<Integer> nextfiveevennumbers=new HashSet<>(firstfiveevennumbers);

		nextfiveevennumbers.add(10);
		nextfiveevennumbers.add(12);
		nextfiveevennumbers.add(14);
		nextfiveevennumbers.add(16);
		nextfiveevennumbers.add(18);
		
		Set<Integer> evennumbers=new HashSet<>(nextfiveevennumbers);

		
		System.out.println(evennumbers);
	}

}
