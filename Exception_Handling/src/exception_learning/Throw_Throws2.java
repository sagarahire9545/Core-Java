package exception_learning;

class NegativeDimensionException extends Exception
{
	public String toString()
	{
		return "In Rectanlge should not be -ve Dimension..";
	}
	
}

public class Throw_Throws2
{
	static int area(int l,int b) throws NegativeDimensionException
	{
		if(l<0 || b<0)
			throw new NegativeDimensionException();
		return l*b;
	}
	
    static void fun() throws NegativeDimensionException
	{
		System.out.println("The Rectangle area is:"+area(-10,5));
	}
    
    
	public static void main(String[] args)
	{
		try {
		
			fun();
		}
		catch(NegativeDimensionException e)
		{
			System.out.println(e);
		}
	}
}
