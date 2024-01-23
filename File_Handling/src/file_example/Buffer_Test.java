package file_example;
import java.io.*;
public class Buffer_Test {

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream("C:/Users/SAGAR AHIRE/Desktop/StreamFile/buffer.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		System.out.println((char)bis.read());
		System.out.println((char)bis.read());
		System.out.println((char)bis.read());
		System.out.println((char)bis.read());
		bis.mark(10);
		System.out.println((char)bis.read());
		System.out.println((char)bis.read());
		bis.reset();
		System.out.println((char)bis.read());
		
		System.out.println("String:"+(char)bis.read());

		
		
//	    int data=0;
//		while((data=bis.read())!=-1)
//		{
//			System.out.println((char)data);
//		}
		bis.close();
	}

}
