package exception_learning;

import java.util.Scanner;

public class Ex1 
{

	public static void main(String[] args)
	{
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		
		try
		{
	
		c=a/b;
		
		  System.out.println("Result is:"+c);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denometer should not zero,try again...");
			System.out.println(e);
		}

	}

}
