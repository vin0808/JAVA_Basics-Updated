package Hackathon;

import java.util.Scanner;

public class NonRecursive_factorial {
	public static void main(String[] args) {

		System.out.print("Enter a number to calculate its factorial: ");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		obj.close();

		// method to calculate factorial
		// long result = factorial(num);

		NonRecursive_factorial object = new NonRecursive_factorial();
		long result = object.factorial(num);
		System.out.println("Factorial of " + num + " is: " + result);
	}

	// Method to calculate factorial non-recursively
	public long factorial(int n) {
		long fact = 1;

		// Multiply the numbers from 1 to n
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}

		return fact;
	}
}
