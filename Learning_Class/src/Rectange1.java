
class Rectange
{
	
	public double length;
	public double breadth;
	
	public double area() 
	{
		return length*breadth;
		
	}
	public double perimeter()
	{
		
		return 2*(length+breadth);
	}
	
	public boolean isSquare()
	{
		if(length==breadth)
			return true;
		else 
			return false;
	}
	
}

public class Rectange1 {

	public static void main(String[] args) {
		
		Rectange r=new Rectange();
		
		r.length=5;
		r.breadth=6;
		
		System.out.println("Area of rectange:"+r.area());
		System.out.println("Perimeter of rectangle:"+r.perimeter());
		System.out.println("The rectangle length & breadth is same:"+r.isSquare());

	}

}
