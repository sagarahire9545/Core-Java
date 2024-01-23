package multithreading_learning;

class Addition implements Runnable
{

	@Override
	public  void run()
	{
		int a=10,b=5,c;
		c=a+b;
		System.out.println("Addition is:"+c);
	
	}
	
}

public class Ex2 {

	public static void main(String[] args) 
	{
		Addition a=new Addition();
		Thread th=new Thread(a);
		th.start();

		
		
	   int a1=10,b=5,c;
	   c=a1-b;
	   System.out.println("Substracion is:"+c);

	}

}
