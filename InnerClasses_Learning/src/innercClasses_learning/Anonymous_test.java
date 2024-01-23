package innercClasses_learning;

// Example of Anonymous Inner class
abstract class My
{
	String name;
	public My(String n) {
		name = n;
	}
	void show() {
		System.out.println("show method from abstract class...");
	}
	
	abstract void myMethod();
}

class OuterMy
{
	public void Method()
	{
		// creating object of abstract class
		My m=new My("sagar"){

				@Override
				void myMethod(){
					System.out.println("abstract inner class...");
				}
				};
				
				// calling method of object in abstract inner class
				m.myMethod();
				m.show();
	}
}

public class Anonymous_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterMy om=new OuterMy();
		om.Method();
	}

}
