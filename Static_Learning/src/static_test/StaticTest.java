package static_test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StaticTest {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		// using setter methods
		Employee emp = new Employee();
		emp.setName("Sagar");
		emp.setAddress("Nashik");
		emp.setId(12);
		emp.setSalary(12000);

		list.add(emp);

		System.out.println(emp);

		System.out.println("-------------");

		// using for-each loop
		for (Employee x : list) {
			System.out.println(x);
		}

		// using getter methods
		System.out.println("Name: " + emp.getName());
		System.out.println("Address: " + emp.getAddress());
		System.out.println("Id: " + emp.getId());
		System.out.println("Salary: " + emp.getSalary());

		// using iterator
		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
