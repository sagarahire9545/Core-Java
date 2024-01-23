package HashSet;
import java.util.*;

public class RemoveEx {

	public static void main(String[] args)
	{
       Set<Integer> numbers=new HashSet<>();
       numbers.add(1);
       numbers.add(2);
       numbers.add(3);     
       numbers.add(4);
       numbers.add(5);
       numbers.add(6);
       numbers.add(7);
       numbers.add(8);
       numbers.add(9);
       numbers.add(10);
       numbers.add(11);
       numbers.add(12);

       boolean result=numbers.remove(1);
       System.out.println("The no is remove:"+result);
       System.out.println(numbers);
       
       Set<Integer> evennumbers=new HashSet<>();
		
       evennumbers.add(2);
       evennumbers.add(4);
       evennumbers.add(6);
       evennumbers.add(8);
       evennumbers.add(10);
       evennumbers.add(12);


       numbers.removeAll(evennumbers);
       System.out.println(numbers);
       
       // Clear method
       numbers.clear();
       System.out.println(numbers);
       
		
	}

}
