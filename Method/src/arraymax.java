
public class arraymax {

	int MaxArr(int A[])
	{
		int max = A[0];
		
		for(int i=0;i<A.length;i++)
			max=A[i];
		
		return max;
	}
	public static void main(String[] args) {
		
		
		 int A[]= {10,20,304,60,678,984};
		 
		 arraymax m=new arraymax();
		 
		System.out.println(m.MaxArr(A));
		
		

	}

}
