import java.util.*;
import java.util.Scanner;

public class Radix {

	
	public static void main(String[] args) {
		String num;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		num=scan.nextLine();
		
		if(num.matches("[01]+")) {
			
			System.out.println("Binary Radix=2.");
			
		}else if(num.matches("[0-7]+")) {
			
			System.out.println("Octal Radix=8.");
			
		}else if(num.matches("[0-9]+")) {
			
			System.out.println("Decimal Radix=10.");
		}else if(num.matches("[0-9A-F]+")) {
			
			System.out.println("Hexa Raix=16");
		}else {
			
			System.out.println("Not a number.");
		}
		
		
	}

}
