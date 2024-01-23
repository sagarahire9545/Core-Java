import java.util.Scanner;

class Swap
{
	public void swap(int a,int b)
	{
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println(+a+" "+b);
	}
}


public class SwapNo {

	public static void main(String[] args) 
	{
		Swap s=new Swap();
		s.swap(10, 20);
		

	}

}
