package file_example;
import java.io.CharArrayReader;
import java.io.IOException;
import java.lang.*;
public class char_stream {

	public static void main(String[] args) throws IOException
	{
		char c[]= {'a','b','c','d','e','f','g','h','i','j'};
		
		CharArrayReader cis=new CharArrayReader(c);
		
		int data=0;
		while((data=cis.read())!=-1)
		{
			System.out.print((char)data);
		}
		
		cis.close();

	}

}
