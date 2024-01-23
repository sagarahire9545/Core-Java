package innercClasses_learning;

// Example of Nested inner class
// Outer class inside a class is called inner class

class Outer
{
	int x=10;   // global variable
	
	class Inner
	{
		int y=20;
		public void innerDiplay()
		{
			System.out.println(x);
		}
	}
	
	public void OuterDiplay()
	{
		Inner i=new Inner();
		i.innerDiplay();
		System.out.println(i.y);
				
	}
}


public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Outer o=new Outer();
//		o.OuterDiplay();
		
		Outer.Inner oi=new Outer().new Inner();
		oi.innerDiplay();
		System.out.println(oi.y);  // outerDipaly statement
	}

}
