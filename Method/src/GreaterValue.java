
public class GreaterValue {

	
	static int max(int a,int b) {
		
		if(a>b)
		{
			return a;
		}else 
		{
			return b;
		}
		
		
	}
	
	public static void main(String[] args) {
		
        int x=10, y=20;
        
        System.out.println(max(x,y));
        
//        GreaterValue gv=new GreaterValue();
//        
//        System.out.println( gv.max(x,y));
	}

}
