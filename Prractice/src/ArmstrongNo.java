
public class ArmstrongNo {

	public static void main(String[] args)
	{

		int n=153;
		int rem, temp=n;
		int sum=0;
		
		while(n!=0)
		{
			rem=n%10;
			sum = sum+(rem*rem*rem);
			n=n/10;
			
		}
		if(temp==sum) {
			
			System.out.println("armstrong no");
		}else {
			System.out.println("not");
		}
		
	}

}
