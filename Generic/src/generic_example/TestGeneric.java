package generic_example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestGeneric {

	public static void main(String[] args) {

		List<Student> list=new ArrayList<>();
		
		Student st=new Student();
		st.setName("Sagar");
		st.setRollno(04);
		st.setAge(23);
		st.setFees(55000);
		
		list.add(st);
		
		
		Iterator<Student> itr=list.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		System.out.println("-------------");
		
		for(Student x:list)
			System.out.println(x);
		
		System.out.println("Name: "+st.getName());
		System.out.println("Age: "+st.getAge()+"\nRollNo: "+st.getRollno()+"\nFees: "+st.getFees());
		
	
	}

}
