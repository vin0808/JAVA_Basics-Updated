package Day1;

import java.util.*;

public class Factorial_of_a_number {

	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);

		System.out.println("Enter a Number to find factorial");

		int number = SC.nextInt();
		int fact = 1;

		for (int i = 1; i <= number; i++) {
			fact = fact * i;

		}
		System.out.println("Factorial of the number is :" + fact);
		SC.close();
	}

}
