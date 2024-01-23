package file_example;

//import java.io.ByteArrayOutputStream;
import java.io.*;;

public class ByteOutput {

	public static void main(String[] args) 
	{
		try
		{
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		
		bos.write('a');
		bos.write('b');
		bos.write('c');
		bos.write('d');
		bos.write('e');
		bos.write('f');
		
		//shared data into Test.txt file  
		bos.writeTo(new FileOutputStream("C:/Users/SAGAR AHIRE/Desktop/StreamFile/Test.txt"));
		

//		byte[] b=bos.toByteArray();
//		
//		for(byte data:b)
//			System.out.println((char)data);
//			
        bos.close();
        
        
        
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
