package Day2;

import java.util.Scanner;

public class overloading {

	// method to find sum of two numbers

	public int sum(int a, int b) {

		int c = a + b;

		return c;
	}

	// method to find sum of three numbers
	public int sum(int a1, int b1, int c1) {

		int d1 = a1 + b1 + c1;

		return d1;
	}

// method to find area of triangle
	public double area(double base, double height) {
		double res = (1 / 2f) * (base * height);
		return res;
	}

//method to find area of circle
	public double area(double radius) {
		double res1 = (Math.PI * radius * radius);
		return res1;
	}

	public static void main(String[] args) {
		{
			Scanner scanner = new Scanner(System.in);
			overloading obj = new overloading();

			// sum of two numbers
			System.out.print("Enter two numbers to add: ");
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println("Sum of two numbers: " + obj.sum(a, b));

			// Sum of three numbers
			System.out.print("Enter three numbers to find the largest: ");
			int a1 = scanner.nextInt();
			int b1 = scanner.nextInt();
			int c1 = scanner.nextInt();
			System.out.println("sum of three numbers: " + obj.sum(a1, b1, c1));

			// Finding area of a Rectangle
			System.out.print("Enter base and height of the triangle: ");
			double base = scanner.nextDouble();
			double height = scanner.nextDouble();
			System.out.println("Area of the Triangle: " + obj.area(base, height));

			// Finding area of a circle
			System.out.print("Enter the radius of the circle: ");
			double radius = scanner.nextDouble();
			System.out.println("Area of the circle: " + obj.area(radius));

			scanner.close();
		}
	}

}
