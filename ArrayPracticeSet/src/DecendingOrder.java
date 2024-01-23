import java.util.Arrays;

public class DecendingOrder {

	public static void main(String[] args) {
		
		int array[]= {10,20,72,76,90,100,54};
		
		System.out.println("The Deccending order of array is:");
		
		Arrays.sort(array);
		
		for(int i=array.length-1; i>=0; i--) {
			
           System.out.println( +array[i]);
		}

	}

}
