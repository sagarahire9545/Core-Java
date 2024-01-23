package generic_example;

import java.util.*;
import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		Address add = new Address("Karve road", "Pune", "India");

		// using setter methods
		Address add1 = new Address();
		add1.setStreet("Katraj road");
		add1.setCity("Nashik");
		add1.setCountry("India");

		// using seeter methods
		Student st = new Student();
		st.setName("Ghansyam");
		st.setAge(24);
		st.setRollno(45);
		st.setFees(10000);
		st.setAdd(add);
		st.setAdd(add1);

		// using constructor
		// Address add = new Address("Karve road", "Pune", "India");

		// using student constructor

		Student st1 = new Student("Shyam", 65, 34, 40000, new Address("Karve road", "Pune", "India"));

		list.add(st);
		list.add(st1);

		Iterator<Student> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		for (Student x : list)
			System.out.println(x);

	}

}
