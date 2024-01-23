package map_collection;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Long, Account> acc = new Hashtable<>();

		acc.put(1l, new Account("123456", "sagar", "nashik", "9876678765", "12/12/2000", 12000));
		acc.put(2l, new Account("2345", "Akshay", "Pune", "6797878765", "10/08/2000", 11000));
		acc.put(3l, new Account("1456", "sagar", "nashik", "9876678765", "12/12/2020", 10000));

		System.out.println(acc);

		System.out.println("----------------------------");
		System.out.println(acc.hashCode());

		System.out.println("-------------------");

		// Using setter method
		Account a = new Account();
		a.setAccNo("12");
		a.setName("Ankush");
		a.setAdd("Pune");
		a.setPhno("9307327978");
		a.setDob("07/06/1999");
		a.setBalance(17000);

		acc.put((long) 4, a);
		System.out.println(acc);
		
		System.out.println("--------------------keys--------------");
		Set<Long> keys = acc.keySet();
		System.out.println(keys);
		
		Iterator<Long>it=keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
