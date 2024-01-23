
class Cylinder
{
	public double radius;
	public double height;
	
	public double lidArea()
	{
	  return Math.PI*radius*radius;	
	}
	
	public double totalSurfaceArea()
	{
		return 2* lidArea()+circumference()*height;
	}
	public double circumference()
	{
		return 2*Math.PI*radius;
	}
	public double volume()
	{
		return lidArea()*height;
	}
}

public class CylinderProg {

	public static void main(String[] args) {
		
		Cylinder cy=new Cylinder();
		cy.radius=7;
		cy.height=10.0;
		
		System.out.println("LidArea of Cylinder is:"+cy.lidArea());
		System.out.println("TotalSurfaceArea of Cylinder is:"+cy.totalSurfaceArea());
		System.out.println("Circumference of Cylinder is:"+cy.circumference());
		System.out.println("Volume  of Cylinder is:"+cy.volume());
	}

}
