
public class Fibonacci {

	public static void main(String[] args) {

		int previous = 0;
		int next = 1;
		int result = 0;

		for (int i = 0; i < 10; i++) {

			result = previous + next;
			previous = next;
			next = result;
		}
		System.out.println(result);

	}

}
