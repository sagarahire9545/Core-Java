package anno_learning;

abstract class Parent
{
	abstract void Display();
}

class Sub extends Parent
{
	

	@Override
	void Display() {
		// TODO Auto-generated method stub
		System.out.println("Abstract Method");
	}
	
	@Depreacated 
	public void show()
	{
		System.out.println("Show method.....");
	}
}

public class Annotation_Test {

	public static void main(String[] args) 
	{
		
		Sub s=new Sub();
		s.Display();
		
		s.show();
				

	}

}
