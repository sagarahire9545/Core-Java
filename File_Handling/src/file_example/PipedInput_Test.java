package file_example;

import java.io.*;;

class Producer extends Thread
{
	OutputStream os;
	
	public Producer(OutputStream o)
	{
		os=o;
	}
	
	public  void run()
	{
		int count=1;
		while(true)
		{
			try
			{
				os.write(count);
			os.flush();
			System.out.println("Producer:"+count);
			System.out.flush();
			count++;
			Thread.sleep(10);
			
			
			}
			catch(Exception e) {}
	  } 
  }
}
class Consumer extends Thread
	{
		InputStream is;
		
		public Consumer(InputStream o)
		{
			is=o;
		}
		
		public void run()
		{
			int data=1;
			while(true)
			{
				try
				{
				
				data=is.read();
				System.out.println("Consumer:"+data);
				System.out.flush();
				Thread.sleep(10);
		
				}
				catch(Exception e) {}
		}

	}
}


public class PipedInput_Test {
	
  public static void main(String[] args) throws Exception
	{
		PipedInputStream pis=new PipedInputStream();
		PipedOutputStream pos=new PipedOutputStream();
		
		pos.connect(pis);
		
		Producer p=new Producer(pos);
		Consumer c=new Consumer(pis);
		
		p.start();
		c.start();
		
		

	}
}

