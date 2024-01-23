
public class change {

	static void Change(int A[],int index,int value) {
		
		A[index]=value;
		
	}
	public static void main(String[] args) {
		
		int A[]= {10,20,30,40,50};
		
		Change(A,2,80);
		
		for(int x:A) {
			
			System.out.println(x);
		}
		
		
	}

}
