import java.util.*;
import java.util.Scanner;

public class SwitchCase2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Domain name:");
		
		String Domain=sc.nextLine();
		
		String ext=Domain.substring(Domain.lastIndexOf(".")+1);
		
		switch(ext) {
		
		case "com":
			System.out.println("Commercial");
			break;
		case "net":
			System.out.println("Networking");
			break;
		case "gov":
			System.out.println("Governmet");
			break;
		case "org":
			System.out.println("Organization");
			break;
			default:
				System.out.println("Invalid Input");
				break;
		}
		

	}

}
