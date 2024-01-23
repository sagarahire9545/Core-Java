package collection_learning;

import java.util.LinkedList;

public class LiknedListDemo1 {

	public static void main(String[] args)
	{
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("B");
		l1.add("C");
		l1.add("D");
		l1.add("E");
		l1.addFirst("A");
		l1.addLast("Z");
		l1.add(2, "S");
		
		l1.remove(2);
		l1.removeFirst();
		l1.removeLast();
		
		l1.set(1, "Y");
		
		
		for(String str:l1)
		{
			System.out.println(str);
		}
		
       System.out.println("=====================");
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
        System.out.println(l1.get(3));
	}

}
