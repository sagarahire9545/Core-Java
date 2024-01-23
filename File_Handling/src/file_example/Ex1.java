package file_example;
import java.io.*;


public class Ex1 {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fos=new FileOutputStream("C:/Users/SAGAR AHIRE/Desktop/StreamFile/Gha.txt");
		
		String str="heuu";
		for(int i=0;i<str.length();i++)
		{
			fos.write(str.charAt(i));
		}
		System.out.println("Data write succssfully");
		fos.close();
		
		FileInputStream fis=new FileInputStream("C:/Users/SAGAR AHIRE/Desktop/StreamFile/Gha.txt");
		int data=0;
		while((data=fis.read())!=-1)
		{
			System.out.println((char)data);
		}
        fis.close();
	}

}
