package generics_example;

public class GenericEx1 {

	public static void main(String[] args)
	{
		int a=10,b=-3,c=4;
		
		System.out.println((a++)+(++b)+(++c)-(a++)-(--b)+(++b)+(--c)+(++a)-(--b));

	}

}
