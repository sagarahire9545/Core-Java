package static_learning;

class Test
{
	static
	{
		System.out.println("Block 1");
	}
	static 
	{
		System.out.println("Block 2");
	}
}

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//Test t1= new Test();
		System.out.println("Main");
		Test t1= new Test();

	}

}
