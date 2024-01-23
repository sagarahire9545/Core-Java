package collection_learning;

import java.util.Stack;

public class Stack_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> sc=new Stack<>();
		sc.push(10);
		sc.push(11);
		sc.push(12);
		sc.push(13);
		sc.push(14);
		sc.push(10);
		sc.push(11);
		
		System.out.println(sc);
		
		sc.pop();
		System.out.println(sc);
		
		System.out.println(sc.search(11));
		

	}

}
