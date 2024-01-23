package multithreading_learning;

class MyData
{
	//Method synchronization
	public synchronized void display(String str)
	{
		// Block-of-Synchronization
		//synchronized(this)
		//{
		   int i;
		   for(i=0;i<str.length();i++)
		   {
			   System.out.print(str.charAt(i));
			   
			   try {
				     Thread.sleep(1000);
			        } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		   }
		//}  
	}
}

class MyThread1 extends Thread
{
	MyData d;
	public MyThread1(MyData d)
	{
	    this.d=d;	
	}
	
	public void run()
	{
		d.display("Hello ");
	}
}

class MyThread2 extends Thread
{
	MyData d;
	MyThread2(MyData d)
	{
		this.d=d;
		
	}
	
	public void run()
	{
		d.display(" Sagar");
	}
}

public class Synchronisation_Threds {

	public static void main(String[] args)
	{
		MyData data=new MyData();
		
		MyThread1 t1=new MyThread1(data);
		MyThread2 t2=new MyThread2(data);
		
		t1.start();
		t2.start();

	}

}
