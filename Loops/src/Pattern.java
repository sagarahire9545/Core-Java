
public class Pattern {

	public static void main(String[] args) {
		
		int i,j;
		int count=0;
		for(i=1;i<=5;i++) {
			
			for(j=1;j<=5;j++) {
				
//				System.out.print(i+ " ");
//				System.out.print(i+j+ " ");
				count++; 
				System.out.format("%02d ",count);
				
				
			}
			System.out.println("");
		}
	}

}
