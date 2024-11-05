package Hackathon;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) throws Exception {

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);

		String num = sc.next();

		int num1 = 0;
		try {
			num1 = Integer.parseInt(num);
		} catch (NumberFormatException e) {
			System.out.println("invalid input" + e.getMessage());
			sc.close();
			return;
		}

		sc.close();

		if (num1 < 0) {
			System.out.println("Please enter positive number");
			throw new Exception(" Factorial of negative number is undefined!!!");
		}

		long fact = 1;

		for (long i = 1; i <= num1; i++) {
			fact = fact * i;
		}

		System.out.println("factorial is :" + fact);
	}

}
