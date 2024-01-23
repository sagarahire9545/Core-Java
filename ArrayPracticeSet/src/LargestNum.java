
public class LargestNum 
{

	public static void main(String[] args)
	{
		
		int A[]= {40,50,70,20,30,};
		//int max=0;
		int min =0;
		/*
		for(int i=0;i<A.length;i++)
		{
			
			if(A[i]>max)
			{
				
				max=A[i];
			}
		}
		System.out.println("Max:"+max);
		*/
		
		for(int i=0;i<A.length-1;i++)
		{
			if(A[i]<min)
			{
				min=A[i];
			}
		}
	}

}
