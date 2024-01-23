
public class Area 
{
	static double area(double l,double b) {
		
		double a=l*b;
		
		return a;
		
	}
	
	static double area(double r) {
		
		double a=Math.PI*r*r;
		return a;
	}
	
	public static void main(String[] args) {
		
//		System.out.println(area(10,15));
		System.out.println(area(10));

	}

}
