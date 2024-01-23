package static_learning;

class Super
{
	final int x=10;
	final void meth1()
	{
		System.out.println("The no is:"+x);
	}
	
	void meth2()
	{
		System.out.println("Meth 2");
	}
	
}
class Sub extends Super
{
	int x=20;
	void meth2()
	{
		System.out.println("Sub meth2");
	}
	
	void meth3()
	{
		System.out.println("Meth 3");
	}
}


public class Ex_Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sub sb=new Sub();
		sb.meth1();
		sb.meth2();
		sb.meth3();
	}

}
