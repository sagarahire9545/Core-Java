package multithreading_learning;

class YeildTest extends Thread
{
	public void run()
	{
		int i=1;
		while(true)
		{
			System.out.println(i++);
		}
	}
}

public class YeildThreadTest {

	public static void main(String[] args)
	{
		 YeildTest t=new  YeildTest();
		 t.start();

		
	}

}
