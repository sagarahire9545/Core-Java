package collection_learning;

public class NeedsOfCollection {

	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		int f=60;
		int g=70;
		int h=80;
		
		int arr[]=new int[10000];
		
		//Limitations of array
		//1. Arrays are fixed in size
		//2. Arrays can hold only homogeneous data elements
		
		Student[] students=new Student[10];
		Book[] book=new Book[10];
		
		students=new Student[1];
		students=new Student[2];
		students=new Student[3];
	// students=new Book[1];   its not homogeneous data type
		
        Object obj[]=new Object[10000];
        obj[1]= new Object();
        obj[2]= new Object();
        obj[3]= new Object();
        obj[4]= new Student();
        obj[1]= new Book();
	}

}
class Student
{
	
}
class Book
{
	
}