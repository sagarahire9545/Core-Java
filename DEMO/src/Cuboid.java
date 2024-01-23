import java.lang.*;
import java.util.Scanner;

public class Cuboid 
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		int l,b,h;
		int totalArea,volume;
		
		System.out.println("Enter the length breath & height:");
		
		l=sc.nextInt();
		b=sc.nextInt();
		h=sc.nextInt();
		
		totalArea=2*(l*b+l*h+b*h);
		volume=l*b*h;
		
		System.out.println("The totalArea is:"+totalArea);
		System.out.println("The volume is:"+volume);
		
		
		

	}

}
