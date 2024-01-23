
public class SecondLargestNum {

	public static void main(String[] args) {
		
		int z[]= {10,20,30,40,50,60,70};
		int max1=0;
		int max2=0;
		
		for(int i=0;i<z.length;i++) 
		{
			
			if(z[i]>max1) 
			{
				max2=max1;
				max1=z[i];
				
			}
			
			if(z[i]>max2 && z[i]<max1)
			{
				
				max2=z[i];
			}
		}
		System.out.println("max1:"+max1);
		System.out.println("max2:"+max2);
		

	}

}
