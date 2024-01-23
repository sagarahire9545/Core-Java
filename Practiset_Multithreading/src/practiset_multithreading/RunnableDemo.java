package practiset_multithreading;

class RunnableD implements Runnable
{
	private Thread t;
	private String ThreadName;
	private int i;
	public RunnableD(String name) {
		
		ThreadName = name;
		System.out.println("creating:"+ThreadName);
	}
	
	public void run()
	{
		 System.out.println("Running " +  ThreadName );
		for(int i=5;i>0;i++);
		System.out.println("Thread: " + ThreadName + ", " + i);
		try
		{
		Thread.sleep(50);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
		
}

public class RunnableDemo
{

	public static void main(String[] args)
	{
        RunnableD r1=new RunnableD("T1");
        Thread t1=new Thread(r1);
        t1.start();
        
        
        //for class extending
//        RunnableD r2=new RunnableD("T2");
//        r2.start();
//        
//        RunnableD r3=new RunnableD("T3");
//        r3.start();
//        
//        RunnableD r4=new RunnableD("T4");
//        r4.start();
	}

}
