package innercClasses_learning;
 
class Operations
{
	int x=10;
	int y=20;
	
	class methods{
		
		public void addition()
		{
			int s=x+y;
			System.out.println(s);
		}
		
		public void substraction()
		{
			int s=x-y;
			System.out.println(s);
		}
		public void mult()
		{
			int m=x*y;
			System.out.println(m);
		}
		public void divide()
		{
			int d=x/y;
			System.out.println(d);
		}
	}
	
	// *****outer class method**
 	public void Outer()  
	{
		methods m=new methods();
		m.addition();
		m.substraction();
		m.mult();
		m.divide();
			
	}
}



public class Maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operations op=new Operations();
//		op.x=10;
//		op.y=20;
		op.Outer();
	}

}
