
public class ArrNumRev
{

	static int reverse(int n)
	{
		
		int rev=0;
		while(n>0)
		{
			
			rev=rev*10+n%10;
			n=n/10;
		}return rev;
	}
	
	static int [] reverse(int A[]) 
	{
		int B[]=new int[A.length];
		
		for(int i=A.length-1,j=0;i>=0;i--,j++)
			B[j]=A[i];
		return B;
	}
	
	
	public static void main(String[] args)
	{
	  	
      int arr[]= {10,20,30,40,50,60,70,80};
      
      int[] z = reverse(arr);
      System.out.println(reverse(199));
      System.out.println(z);
	}

}
