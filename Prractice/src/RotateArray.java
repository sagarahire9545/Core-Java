
public class RotateArray {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Original array: " + arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			int first;
			first = arr[0];
			int j;

			for (j = 0; j < arr.length - 1; j++) {

				arr[j] = arr[j + 1];

			}
			arr[j] = first;
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print("After array: " + arr[i]);
		}
	}

}
