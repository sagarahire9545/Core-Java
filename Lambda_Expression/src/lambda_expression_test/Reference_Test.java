package lambda_expression_test;

interface Hi
{
	public void show();
}

class Hello
{
	void show()
	{
		
	}
	public static void Display()
	{
		System.out.println("Saagarr....");
	}
}

public class Reference_Test {

	public static void main(String[] args) 
	{
		// use static method
		Hi h=Hello::Display;
		h.show();
		h.show();
		
		
		// method also static if not static then create refernce $ Object
		Hello a=new Hello();
		  
//		Hello h1=a::Display;
//		h1.show();
		
		
//		Hi h=System.out::println;
//		h.show("ok");

	}

}
