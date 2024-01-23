package file_example;
import java.io.*;

public class google_input {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("C:/Users/SAGAR AHIRE/Desktop/StreamFile/google.txt");
		
		int data=0;
		while((data=fis.read())!=-1)
		{
			System.out.print((char)data);
		}
		
		
		
		
		
	/*	
		byte b[]=new byte[fis.available()];
		
		fis.read(b);
		String str=new String(b);
		System.out.println(str);
  */
	}

}
