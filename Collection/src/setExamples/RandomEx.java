package setExamples;

import java.util.Iterator;
import java.util.TreeSet;

public class RandomEx {

	public static void main(String[] args) {

		TreeSet<Integer> i=new TreeSet<>();
		
		i.add(12);
		i.add(90);
		i.add(23);
		i.add(13);
		i.add(56);
		
		System.out.println(i);
		
		for(int x:i) {
			System.out.println(x);
		}
		
	}

}
