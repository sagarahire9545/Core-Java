package method_overriding;

// Method overriding example

class Super
{
	public void A()
	{
		
	}
	public void Display()
	{
		System.out.println("Hello");
	}
}
class Sub extends Super
{
	@Override
	public void Display()
	{
		System.out.println("Hello Sirri");
	}
}

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//    ******Dynamic method dispatch********
		
		Super su=new Sub();
		su.Display();
		
		
		
		

	}

}
