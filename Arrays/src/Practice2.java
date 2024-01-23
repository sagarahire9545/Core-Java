
import java.util.Scanner;

public class Practice2
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		int A[]= {1,2,3,4,5,6,7,8,9,10};
		int key;
		System.out.println("Enter the key:");
		
		key=sc.nextInt();
		
		for(int i=0;i<A.length;i++) 
		{
			
			if(key==A[i])
			{
				
				System.out.println("The key found at:"+i);
				System.exit(0);
				
			}
			
		}System.out.println("The key is not found at:");
				

	}

}
