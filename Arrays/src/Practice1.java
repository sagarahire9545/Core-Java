
public class Practice1 {

	public static void main(String[] args) {
		
		
		int A[]= {10,20,30,40,50};
		int B[]= {10,20,10,10,10};
		int c[]= {20,30,50,50,60};		
		int sum=0;
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<A.length;i++) 
		{
			sum=sum+A[i];
			sum1=sum+B[i];
			sum2=sum+c[i];
		}
		System.out.println("sum is:"+sum+" "+sum1+" "+sum2);

//		for(int x:A){
//			
//			sum=sum+x;
//		}
//		System.out.println("sum is:"+sum);	

	}

}
