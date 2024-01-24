
class Rectangle
{
	private double length;
	private double breadth;
	
	public Rectangle()
	{
		length=1;
		breadth=1;
	}
	
	public Rectangle(double l,double b)
	{
		setLength(l);
		setBreadth(b);
	}
	
    public void getBreadth(double b) {
		breadth=b;
		
	}

	public void getLength(double l) {
		length=l;
	
	}
	
	
	public double setBreadth(double b) {
		
		if(b>=0)
			return breadth=b;
		else 
		return	breadth=0;
	
	}

	public double setLength(double l)
	{
		
		if(l>=0)
			return length=l;
		else
			return length=0;
		
	}
	
	public double area()
	{
		return length*breadth;
	}
	public double perimeter()
	{
		return 2*(length+breadth);
	}

	public Rectangle(double s)
	{
		length=breadth=s;
	}
}

public class Rectangle_Test {

	public static void main(String[] args) {
		
       Rectangle r=new Rectangle(10,10);
       System.out.println("Area:"+r.area());
       System.out.println("Perimeter:"+r.perimeter());
       
      
       System.out.println();
       
	}

}
