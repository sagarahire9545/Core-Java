
class Cylinder1
{
	private int radius;
	private int height;
	
	public int getRadius()
	{
		return radius;
		
	}
	public int getHieght()
	{
		return height;
	}
	
	public void setRadius(int r)
	{
		if(r>0)
		   radius=r;
		else
			radius=0;
	}
	
	public void setHeight(int h)
	{
		if(h>0)
			height=h;
		else
			height=0;
	}
	
	public void setDemension(int r,int h)
	{
		radius=r;
		height=h;
	}
	
	public double lidArea()
	{
		return Math.PI*radius*radius;
	}
	
	public double totalSurfaceArea()
	{
		return 2*lidArea()*perimeter()*height;
	}
	
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}

	public double volume()
	{
		return lidArea()*height;
	}
	
	public Cylinder1()
	{
		radius=1;
	}
	
	public Cylinder1(int r,int h)
	{
		radius=r;
		height=h;
	}

}

public class Cylinder {

	public static void main(String[] args) {
	
		Cylinder1 cy=new Cylinder1();
		
		cy.setRadius(10);
		cy.setHeight(15);
		cy.setDemension(10,15);
		
		System.out.println("Lid Area:"+cy.lidArea());
		System.out.println("TotalSurfaceArea:"+cy.totalSurfaceArea());
		System.out.println("Perimeter:"+cy.perimeter());
		System.out.println("volume:"+cy.volume());
		
		System.out.println(cy.getRadius());
        System.out.println(cy.getHieght());

	}

}
