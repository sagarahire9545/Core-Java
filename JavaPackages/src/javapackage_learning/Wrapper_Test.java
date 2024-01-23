package javapackage_learning;

public class Wrapper_Test {

	public static void main(String[] args) 
	{
	   Integer a=new Integer(10);
	   Integer b=Integer.valueOf(10);
	   
	   Integer c=20;
	   
	   System.out.println(a);
	   
	//******************************************************  
	   int m=10;
	   
	   // conv. primitive to oblect=auto-boxing
	   Integer n=Integer.valueOf(m);
	   // Integer n=m;
	   
	   // object to primitive =auto unboxing
	   int p=n;

	   float x=13;
	   Float y=Float.valueOf(x);
	   
	   byte by=25;
	   Byte j=Byte.valueOf(by);
	   
	}

}
