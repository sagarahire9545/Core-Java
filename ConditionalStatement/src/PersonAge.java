import java.lang.*;
import java.util.Scanner;

public class PersonAge {

	public static void main(String[] args) {
		
		int age;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of person:");
		age=sc.nextInt();
		
		if(age>=1 && age<=14) {
			
			System.out.println("The Kids.");
			
		}else if(age>=15 && age<=55) {
			
			System.out.println("The young person.");
		}else {
			
			System.out.println("Old Person.");
		}
		

	}

}
