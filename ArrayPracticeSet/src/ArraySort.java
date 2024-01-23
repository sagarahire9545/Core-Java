import java.util.Arrays;
public class ArraySort {

	public static void main(String[] args) {
		
		int array[]= {20,10,40,50,60,30};
		int temp=0;
		System.out.println("Accending Order:");
    	Arrays.sort(array);
//		
//		for(int i=0;i>array.length;i++) {
//			
//			System.out.println(+array[i]);
//		}

		for(int i=0;i<array.length;i++) {
			
			for(int j=i+1;j<array.length;j++) {
				
				if(array[i]>array[j]) {
					
					temp=array[i];
					
					array[i]=array[j];
					array[j]=temp;
				}
				
				
			}System.out.println(array[i]);
		}
		
		
		
	}

}
