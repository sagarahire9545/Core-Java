import java.util.Scanner;

// import java.util.Scanner;

class Circle
{
    public double radius;
    
    public double area()
    {
    	return Math.PI*radius*radius;
    }
    
    public double perimeter()
    {
    	return 2*Math.PI*radius;
    }
    
    public double circumference()
    {
    	return perimeter();
    }

    //**********getter setter*****
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
    
    
    
}

class Cylinder extends Circle
{
	public double height;
	
	public Cylinder(int r, int h) {
		// TODO Auto-generated constructor stub
		this.radius=r;
		this.height=h;
		
	}

	public double volume()
	{
		return area()*height;
	}
	
	//getter setter

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}


public class Test_Cylinder {

	public static void main(String[] args) 
	{
	   	
	
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the radius...");
		int r=sc.nextInt();
		
		System.out.println("Enter the Height...");
		int h=sc.nextInt();
		//***** Its not working******
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the radius and height:");
//		
//		
//		double radius=sc.nextDouble();
//		double height=sc.nextDouble();
		
	  Cylinder c=new Cylinder(r,h);
	  
//	  c.radius=7;
//	  c.height=10;
	  
//	  c.setRadius(10);
//	  c.setHeight(7);

//	  System.out.println("Radius: "+c.getRadius());
//	  System.out.println("Height: "+c.getHeight());
	  
	  System.out.println("Area:"+c.area());
	  System.out.println("Perimeter:"+c.perimeter());
	  System.out.println("Circumference:"+c.circumference());
	  System.out.println("Volume:"+c.volume());

	}

}
