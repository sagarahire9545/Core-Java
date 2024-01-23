package exception_learning;

public class Checked_Unchecked 
{
	static void meth1()
	{
		try
		{
	   System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
	static void meth2()
	{
		meth1();
	}
	static void meth3()
	{
		meth2();
	}

	public static void main(String[] args)
	{
		meth3();

	}

}
