

class Circle1
{
	
	public double radius;
	
	public double area()
	{
		
		return Math.PI *radius *radius;
		
	}
	
	public double perimeter() 
	{
		
		return 2* Math.PI* radius;
		
	}
	
	public double circumference()
	{
		
		return perimeter();
	}
	
}
public class Circle
{

	public static void main(String[] args) 
	{
		
		Circle1 c=new Circle1();
		Circle1 c2=new Circle1();
		c.radius=7;
		c2.radius=14;
		
		System.out.println("Area of Circle:" +c.area());
		System.out.println("Perimeter of circle:"+ c.perimeter());
		System.out.println("Circumference of circle:"  +c.circumference());
		
		System.out.println("  ");
		System.out.println("Area2 of Circle:" +c2.area());
		System.out.println("Perimeter2 of circle:"+ c2.perimeter());
		System.out.println("Circumference2 of circle:"  +c2.circumference());
		

	}

}
