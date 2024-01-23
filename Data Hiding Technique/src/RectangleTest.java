
class Rectangle
 {
	private int length;
	private int breadth;
	
	public int getlength()
	{
		return length;
	}
	public void setlength(int l)
	{
		if(l>0)
			length=l;
		else
			length=0;
	}
	
	public int getbreadth()
	{
		return breadth;
	}
	public void setbreadth(int b)
	{
		breadth=b;
	}
	
	
	public int area()
	{
		return length*breadth;
	}
	public int perimeter()
	{
		return 2*(length+breadth);
	}
}

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle r=new Rectangle();
		
		r.setlength(8);
		r.setbreadth(8);
		
        System.out.println("Area:"+r.area());
        System.out.println("Perimeter:"+r.perimeter());
        
        System.out.println(r.getlength());
        System.out.println(r.getbreadth());

	}

}
