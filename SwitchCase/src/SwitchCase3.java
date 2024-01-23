import java.util.*;
import java.util.Scanner;

public class SwitchCase3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("****Menu****");
		System.out.println("------------");
		System.out.println("Add");
		System.out.println("Sub");
		System.out.println("Mult");
		System.out.println("Div");
		System.out.println("------------");
		
		System.out.println("Enter the two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the optino:");
		
		String option=sc.nextLine();
		
		switch(option) {
		
		case "Add":
			
			System.out.println("Addition:"+(a+b));
			break;
			
		case "Sub":
			System.out.println("Substraction:"+(a-b));
			break;
			
		case "Mult":
			System.out.println("Multiplication:"+(a*b));
			break;
			
		case "Div":
			System.out.println("Division:"+(a/b));
			break;
			
			default:
				System.out.println("Invalid Input");
			break;
			
			
		}
	



	}

}
