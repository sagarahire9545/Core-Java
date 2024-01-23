package javapackage_learning;



public class String_Buffer {

	public static void main(String[] args) 
	{
		String s1=new String("Hello");
		StringBuffer s2=new StringBuffer("Hello");
		StringBuilder s3=new StringBuilder("Hello");
		
		s2.reverse();
		System.out.println(s2);
		s1.concat(" World");  // String are immutable
		s2.append(" World");   //Its mutable,modifiable
		s3.append(" World");   
		
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        

	}

}
