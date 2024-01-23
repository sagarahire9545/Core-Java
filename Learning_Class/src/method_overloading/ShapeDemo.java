package method_overloading;

import java.util.Scanner;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateArea a = new CalculateArea();
		int choice;
		String str = "";
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("****** Areas ********");
			System.out.println("1.Circle");
			System.out.println("2.Rectangle");
			System.out.println("3.Triange");
			System.out.println("4.Square");

			System.out.println("Enter the choice...!");
			choice = sc.nextInt();

			switch (choice) {

			case 1:

				System.out.println("Enter the radius: ");
				int r = sc.nextInt();

				a.area(r);
				break;

			case 2:
				System.out.println("Enter the length: ");
				double l = sc.nextDouble();

				System.out.println("Enter the breadth: ");
				double b = sc.nextDouble();

				a.area(l, b);
				break;

			case 3:
				System.out.println("Enter the Height: ");
				double h = sc.nextDouble();

				System.out.println("Enter the Base: ");
				double bs = sc.nextDouble();

				a.area(h, bs);
				break;
				
				default: 
					System.out.println("Executed..");

//			case 4:
//				System.out.println("Enter the length: ");
//				float l1 = sc.nextFloat();
//
//				a.area(l1);
//				break;
				
			}
			

		} while (choice<3);
		{
			System.out.println("Invalid Input");
		}

	}

}
