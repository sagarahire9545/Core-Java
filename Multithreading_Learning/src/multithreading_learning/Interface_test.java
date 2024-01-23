package multithreading_learning;

class Ex1 implements Runnable
{
	public void run()
	{
		int i=1;
		while(true)
		{
			System.out.println(i+"Hello");
			i++;
		}
	}
}

public class Interface_test {

	public static void main(String[] args)
	{
		Ex1 e=new Ex1();
		Thread t=new Thread(e);
		t.start();
		
		int i=1;
		while(true)
		{
			System.out.println(i+"World");
			i++;
		}

	}

}
