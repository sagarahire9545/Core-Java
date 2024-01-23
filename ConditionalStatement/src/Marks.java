import java.lang.*;
import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		
		int m1 = 0 ,m2=0 ,m3=0;
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of 3 subjects:");
		
		float total=m1+m2+m3; 
		float avg= (total)/3;
		
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		
		if(avg>=85  && avg<=100) {
			
			System.out.println("First class with distinction.(A+)");
			
		}else if(avg>=70 && avg<=86) {
			
			System.out.println("First Class.(A)");
			
		}else if(avg>=60 && avg<=69) {
			
			System.out.println("Second Class.(B)");
		}else if(avg>=50 && avg<=30){
			
			System.out.println("Pass.");
		}else {
			System.out.println("Failed");
		}


		
	}

}
