package exception_learning;

public class Finally {

	public static void main(String[] args) 
	{

		int a=10;
		int b=2;
		try
		{
		int c=a/b;
		
		System.out.println("Result is:"+c);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("It always executed...");
		}
	}

}
