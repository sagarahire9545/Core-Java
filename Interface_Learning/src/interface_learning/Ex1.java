package interface_learning;

interface Test
{
	void meth1();
	void meth2();
	
}
class MyTest implements Test
{

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("My meth2 ");
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("My meth2");
	}
	
	public void meth3()
	{
		System.out.println("My meth 3");
	}
	
}



public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Dynamic method dispatch (run time poylmorphism)
		Test t=new MyTest();
		t.meth1();
		t.meth2();
		
	}

}
