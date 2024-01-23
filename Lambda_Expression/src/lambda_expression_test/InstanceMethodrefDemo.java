package lambda_expression_test;

public class InstanceMethodrefDemo {
	
	public void saySomething() {
		System.out.println("Hey hi......I am");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceMethodrefDemo is=new InstanceMethodrefDemo();
		SayHello say=is::saySomething;

	}

}
