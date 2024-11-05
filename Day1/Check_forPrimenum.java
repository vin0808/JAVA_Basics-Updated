package Day1;

import java.util.Scanner;

public class Check_forPrimenum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		boolean isprime = true;

		// Prime numbers must be greater than 1
		if (num <= 1) {
			isprime = false;
		}

		else {
			// Check for divisibility from 2 to (number - 1)1
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isprime = false;
					break;
				}
			}
		}

		if (isprime) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}

		scanner.close();
	}

}
