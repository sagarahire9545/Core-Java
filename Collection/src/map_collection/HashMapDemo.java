package map_collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<String, Integer> numberMapping = new HashMap<>();

		numberMapping.put("One", 1);
		numberMapping.put("Two", 2);
		numberMapping.put("Three", 3);
		numberMapping.put("Four", 4);
		numberMapping.put("Five", 5);
		numberMapping.put("Six", 6);
		numberMapping.put("Seven", 7);

		// its contains null values
		numberMapping.put(null, 8);

		// its not a duplicate value
		numberMapping.put("Two", 2);

		System.out.println(numberMapping);

		// check if a HashMap is a empty or not
		System.out.println(numberMapping.isEmpty());

		// find the size of HashMap
		System.out.println(numberMapping.size());

		// check key is a exist

		if (numberMapping.containsKey("Six")) {
			System.out.println("Exist");
		} else {
			System.out.println("Not Exist");
		}

		// check value is a exist
		if (numberMapping.containsValue(6)) {

			System.out.println("Exist");
		} else {
			System.out.println("Not Exist");
		}

		// get the value by key
		System.out.println(numberMapping.get("Seven"));

		// remove key from HashMap
		numberMapping.remove("Two");
		System.out.println(numberMapping);

		// get only keys from hashmap
		Set<String> keys = numberMapping.keySet();
		System.out.println(keys);

		// get only values from hashmap
		Collection<Integer> val = numberMapping.values();
		System.out.println(val);

		// Iterators

		// simple foe each method
		for (Map.Entry<String, Integer> entry : numberMapping.entrySet()) {
			System.out.println(entry);
		}
		System.out.println("--------------");

		// Iterator
		Set<Entry<String, Integer>> set = numberMapping.entrySet();
		System.out.println(set);
		
		System.out.println("------------j21---------------");
		
		//only print keys
		Set<String> key=numberMapping.keySet();
		System.out.println(key);
		
		System.out.println("--------------------------------");
		Iterator<String>itr=key.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
