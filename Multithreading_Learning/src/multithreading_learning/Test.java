package multithreading_learning;

//class MyThread extends Thread
//{
//	public void run()
//	{
//		int i=1;
//		while(true)
//		{
//			System.out.println(i+"Hello");
//			i++;
//		}
//	}
//}



public class Test extends Thread
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
	public static void main(String[] args) 
	{
//		MyThread t=new MyThread();
//		t.start();
		
		Test t=new Test();
		t.start();
		
		int i=1;
		while(true)
		{
			System.out.println(i+"World..");
			i++;
		}

	}

}
