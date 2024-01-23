package method_overloading;

import java.util.Scanner;

class CalculateArea {

	public void area(double l) {

		double ar = Math.PI * l * l;
		System.out.println("Area of circle: " + ar);

	}

	public void area(int length, int breadth) {
		double re = length * breadth;
		System.out.println("Area of rectanle: " + re);

	}

	public void area(double height, double base) {

		double tr = (base * height) / 2;
		System.out.println("Area of triangle: " + tr);
	}

//	public void area(int length) {
//		double sqr = length * length;
//		System.out.println("Area of Square: " + sqr);
//
//	}

}

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateArea a = new CalculateArea();
		// a.area(10);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double c = sc.nextInt();
//		a.area(c);

		System.out.println("Enter the length: ");
		double l = sc.nextDouble();

		System.out.println("Enter the breadth: ");
		double b = sc.nextDouble();

		System.out.println("Enter the Height: ");
		double h = sc.nextDouble();

		System.out.println("Enter the Base: ");
		double bs = sc.nextDouble();

		a.area(l);
		a.area(h, b);
		a.area(l, b);

	}

}
