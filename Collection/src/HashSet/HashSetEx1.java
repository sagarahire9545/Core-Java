package HashSet;

import java.util.*;

public class HashSetEx1 {

	public static void main(String[] args)
	{
		Set<String> programminglanguages=new HashSet<>();
		
		// Its unordered collection 
		programminglanguages.add("Java");
		programminglanguages.add("C");
		programminglanguages.add("C++");
		programminglanguages.add("Python");
		programminglanguages.add("Perl");
		programminglanguages.add("JavaScript");
		
		System.out.println(programminglanguages);
		
		
		// Its not allow duplicate element
		programminglanguages.add("Java");
		System.out.println(programminglanguages);

		
		
		

	}

}
