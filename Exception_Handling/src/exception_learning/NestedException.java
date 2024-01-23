package exception_learning;

public class NestedException {

	public static void main(String[] args) 
	{
		 
	
		try
		{
			int A[]= {30,20,40,0,50};
			   System.out.println(A[3]);
		  try
		  { 
		  int c=A[0]/A[3];
		  System.out.println("Result is:"+c);
		  }
		  catch(ArithmeticException e)
		  {
			System.out.println("Denometer should not be 0..");
		  }
		}
		  catch(ArrayIndexOutOfBoundsException e)
		  {
			  System.out.println(e);
		  }
		System.out.println("Bye");

	}	

}

