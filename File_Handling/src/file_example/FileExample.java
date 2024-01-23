package file_example;
import java.io.*;

public class FileExample {

	public static void main(String[] args) throws Exception
	{
		try
		{
		FileOutputStream fos=new FileOutputStream("C:/Users/SAGAR AHIRE/Desktop/StreamFile/Test.txt");
		 
		String str="Learn Java Program";
		
		// In array
//		byte[] b=str.getBytes();
//*************************************************	
//		fos.write(b, 6, str.length()-6);
	//***********************************************			
//		for(byte x:b)
//			fos.write(x);
		
//************************************************		
		
		 fos.write(str.getBytes());
		fos.close();
		

		}
		catch(FileNotFoundException  e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}


	}

}
