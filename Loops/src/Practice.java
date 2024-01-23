import java.util.*;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Nummber:");
		n=sc.nextInt();
		
		int rev=0,r;
		int m=n;
		while(n>0) {
			
			r=n%10;
			rev=rev*10+r;
			n/=10;
		}  
		System.out.println(rev);
//		if(rev==m) {
//			 
//			
//			System.out.println("The Number is Pallindrome.");
//		}else {
//			System.out.println("The Number is Not Pallindrome.");
//			
//		}
	
	}
}
