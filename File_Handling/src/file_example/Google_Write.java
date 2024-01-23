package file_example;
import java.io.*;

public class Google_Write {

	public static void main(String[] args)
	{
		try
		{
	         FileOutputStream fos=new FileOutputStream("C:/Users/SAGAR AHIRE/Desktop/StreamFile/google.txt");
	         
	         String str="Hello Google....It is the most....... ";
	         
	         fos.write(str.getBytes());
	         fos.close();
	         
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
