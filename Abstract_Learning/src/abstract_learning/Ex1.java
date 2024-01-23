package abstract_learning;

abstract class Super
{
	public void meth1()
	{
		System.out.println("super meth1");
	}
	abstract void meth2();// abstract method has no body
	
}

class child extends Super
{
	@Override
	public void meth2()
	{
		System.out.println("child meth2");
	}
}

public class Ex1 {

	public static void main(String[] args) {
		
		Super s=new child();
		s.meth1();
		s.meth2();

	}

}
