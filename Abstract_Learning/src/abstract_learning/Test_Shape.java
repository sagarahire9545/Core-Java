package abstract_learning;

abstract class Shape
{
	abstract public double perimeter();
	abstract public double area();
}
class Circle extends Shape
{
	public double radius;
	

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
	
}

class Rectangle extends Shape
{
     public double length;
     public double breadth;
     
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(length+breadth);
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*breadth;
	}
	
}



public class Test_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r=new Rectangle();
		r.breadth=5;
		r.length=10;
		
		System.out.println("Rectangle area:"+r.area());
		System.out.println("Rectangle perimeter:"+r.perimeter());
		
		Shape s=r;
	
		System.out.println("Shape area:"+s.area());
		System.out.println("Shape perimeter:"+s.perimeter());
		
		Circle c=new Circle();
		c.radius=5;
		
		
		System.out.println("Circle area:"+c.area());
		System.out.println("Circle perimeter:"+c.perimeter());

	}

}
