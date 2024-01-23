package multithreading_learning;

class MyThread extends Thread
{
	public MyThread(String name)
	{
		super(name);
		//setPriority(Thread.MAX_PRIORITY);
	}
	public void run()
	{
		int i=1;
		while(true)
		{
			try
			{
			System.out.println(i++);
			Thread.sleep(1000);
		
			}
			catch( InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
public class ThreadTest 
{
	public static void main(String[] args)
	{
		MyThread t=new MyThread("MyThread 1");
		
		t.start();
		t.interrupt();
		
		
		
	
		
//		System.out.println("Id "+t.getId());
//		System.out.println("Name "+t.getName());
//		
//		System.out.println("Priority "+t.getPriority());
//		t.start();
//		System.out.println("State "+t.getState());
//		System.out.println("Alive "+t.isAlive());
	}

}
