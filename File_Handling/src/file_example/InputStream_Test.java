package file_example;
import java.io.*;

public class InputStream_Test {

	public static void main(String[] args)
	{
		try
		{
		FileInputStream fis=new FileInputStream("C:/Users/SAGAR AHIRE/Desktop/StreamFile/Test.txt");
		
		int data=0;
		while((data=fis.read())!=-1)
		{
			System.out.print((char)data);
		}
		
/*		
 * **************************************************************
		byte b[] =new byte[fis.available()];
		fis.read(b);
		
		String str=new String(b);
		
		System.out.println(str);
*/		
		fis.close();
		
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
