
public class MethodOverLoading {

	int max(int a,int b) {
		
		return a>b?a:b;
		
	}
	
	static float max(float a,float b) {
		
		if(a>b)
			return a;
		else
			return b;
	}
	
	static int max(int a,int b,int c) {
		
		c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
		
//		MethodOverLoading m=new MethodOverLoading();
//		float z=m.max(10.0f,50.0f);
		System.out.println(max(10,50, 0));
	}

}
