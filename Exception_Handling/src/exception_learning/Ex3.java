package exception_learning;

public class Ex3 {

	public static void main(String[] args) 
	{
		try
		{
		int A[]={30,20,10,40,0};
		
		int c=A[0]/A[2];
		System.out.println("Result is:"+c);
		
		System.out.println(A[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denometer should not be 0");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index is Invalid..");
			System.out.println(e);
		}
		System.out.println("Bye.....");
		
		

	}

}
