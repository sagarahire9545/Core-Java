
public class Recursion
{
	
	static void fun(int n)
	{
		
		if(n>0)
		{
//			System.out.println(n);  op: 3 2 1
//			fun(n-1);
			
			fun(n-1);
			System.out.println(n);
		}
		
	}
	

	public static void main(String[] args) {
		
	
		fun(3);

	}

}
