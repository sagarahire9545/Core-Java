
public class Addition {
   int sum;
	static int add(int a,int b) {
		
		int sum=a+b;
		return sum;
	}
	 static int sub(int a,int b)
	{
		int sub=a-b;
	return sub;
	}
	
	public static void main(String[] args) {
		
		int x=20,y=50,z;
//		
//		Addition a=new Addition();
//		z=a.add(x,y);
//		System.out.println(z);
		
		
		System.out.println(add(x, y));
		System.out.println(sub(x,y));

	}

}
