package com.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class Demo {

	public static void main(String[] args) {

		LinkedList<Integer> number = new LinkedList<>();

		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);

		number.add(2, 90);
		number.addFirst(5);
		number.addLast(100);

		System.out.println(number.isEmpty());
		System.out.println(number.get(2));

		System.out.println(number.remove(2));

		// System.out.println(number);

		Collections.sort(number);
		ListIterator<Integer> itr = number.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
       

	}

}
