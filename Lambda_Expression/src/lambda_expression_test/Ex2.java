package lambda_expression_test;

@FunctionalInterface
interface Demo {
	public void display();

}

class Lambda2 {

	public void MyLambda() {
		// Lambda expression
		Demo d = () -> {
			System.out.println("Hey....");
			System.out.println("Google.....");
		};
		d.display();
	}

	void show() {

		System.out.println("I am normal method....");
	}

}

public class Ex2 {

	public static void main(String[] args) {
		Lambda2 d2 = new Lambda2();
		d2.MyLambda();
		d2.show();

	}

}
