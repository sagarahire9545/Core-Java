package lambda_expression_test;

@FunctionalInterface
interface MyLambda
{
	public void display();
}


public class Lamda_Test {

	public static void main(String[] args)
	{
		MyLambda m =()->{System.out.println("Hey Google..");};
				
		m.display();

	}

}
