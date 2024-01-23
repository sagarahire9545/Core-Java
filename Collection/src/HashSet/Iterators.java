package HashSet;
import java.util.*;

public class Iterators {

	public static void main(String[] args)
	{
 
		Set<String> courses=new TreeSet<>();
		courses.add("Java");
		courses.add("Python");
		courses.add("JavaSript");
		courses.add("Perl");
		courses.add("C");
		courses.add("C++");
		
		//For each loop
		for(String x:courses)
		{
			System.out.println(x);
		}
		System.out.println("------------------");
		// lambda expression
	   courses.forEach(course->System.out.println(course));

	}

}
