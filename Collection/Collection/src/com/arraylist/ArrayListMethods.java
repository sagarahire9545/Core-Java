package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Pinapple");

		// Arraylist allows null element
		fruits.add(0, null);

		// It allows duplicate element
		fruits.add("Banana");

		fruits.add(4, "Chiku");

		fruits.remove(0);

		boolean b = fruits.contains("Banana");
		System.out.println(b);

		System.out.println(fruits.get(1));
		System.out.println(fruits.set(4, "Ok"));

		System.out.println(fruits);

		List<String> flower = new ArrayList<>();
		flower.add("Rose");
		flower.add("Kamal");

		flower.addAll(fruits);

		for (String list : flower) {

			System.out.println(list);
		}

//		ListIterator<String> iterator=flower.listIterator();
//		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}

	}

}
