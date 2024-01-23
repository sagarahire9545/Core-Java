import java.lang.*;
import java.util.Scanner;

public class Expression1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 3 sides of triangle ");
		
		int a,b,c;
		float s;
		double area;
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		s=(a+b+c)/2f;
		
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle is:"+area);
		
		

	}

}
