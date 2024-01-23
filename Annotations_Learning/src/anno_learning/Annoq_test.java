package anno_learning;

class Super
{
	public void sup()
	{
		System.out.println("Super method");
	}
}

class Sun extends Super
{
	@Deprecated
	public void sub()
	{
		System.out.println("Sub method...");
	}
}

public class Annoq_test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		Sun s=new Sun();
		s.sup();
		s.sub();
	}

}
