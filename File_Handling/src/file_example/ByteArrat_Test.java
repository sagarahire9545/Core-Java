package file_example;
import java.io.*;


public class ByteArrat_Test {

	public static void main(String[] args)
	{
		try {
		byte b[]= {'a','b','c','d','e','f','g','h','i','j'};
		
		ByteArrayInputStream bis=new ByteArrayInputStream(b);
		
		int data;
		while((data=bis.read())!=-1)
		{
			System.out.print((char)data);
			
		}
		
//		String str=new String(bis.readAllBytes());
//		System.out.println(str);
//		
		bis.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
