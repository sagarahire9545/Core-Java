package lambda_expression_test;

interface Socialmedia{
	void message();
}
public class MethodReffernceDemo {
	
	public static void messageMe() {
		System.out.println("Can i call u...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Socialmedia sm= MethodReffernceDemo::messageMe;
		sm.message();

	}

}
