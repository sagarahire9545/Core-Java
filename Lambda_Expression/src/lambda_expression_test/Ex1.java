package lambda_expression_test;

interface Lambda1
{
	// public void display(String str);
	
	public int add(int a,int b);
}

public class Ex1
{

	public static void main(String[] args) 
	{
		Lambda1 l1=(x,y)->{return x+y;}; 
		System.out.println(l1.add(20, 30));
		

		Lambda1 l2=(x,y)->{return x+y;}; 
		System.out.println(l1.add(50, 70));
		
		
		/*
		Lambda1 l=(s)->{System.out.println(s);};
		l.display("Ok google");
		*/
	}

}
