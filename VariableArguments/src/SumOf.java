//sum of all elements using varagrument 

public class SumOf {

	static int Sum(int ...A) {

		int s = 0;

		for (int i = 0; i < A.length; i++) {
			s = A[i] + A.length;

		}
		return s;
	}

	public static void main(String[] args) {

		System.out.println(Sum(0,40));

	}

}
