package Day1;

//import java.util.stream.*;

import java.util.*;

public class StringReverse {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);

		// to reverse a digit or a string?
		System.out.print("Do you want to reverse a digit or a string?\n For digit enter 1 or For string enter 2 ");
		int choice = SC.nextInt(); // Convert to lowercase for consistency

		if (choice == 1) {
			// Reverse a number
			System.out.print("Enter the number to reverse: ");
			int number = SC.nextInt();
			int reversedNumber = reverseDigits(number);
			System.out.println("Reversed Number is: " + reversedNumber);
		} else if (choice == 2) {
			// Reverse a string
			System.out.print("Enter the string to reverse: ");
			String str = SC.next();
			String reversedString = reverseString(str);
			System.out.println("Reversed String is: " + reversedString);
		} else {
			// Invalid input
			System.out.println("Invalid input! Please enter either 'digit' or 'string'.");
		}

		SC.close();
	}

	// Function to reverse the digits of a number
	public static int reverseDigits(int num) {
		int reversed = 0;
		while (num != 0) {
			int digit = num % 10; // Get the last digit
			reversed = reversed * 10 + digit; // Append the digit to the reversed number
			num /= 10; // Remove the last digit from the number
		}
		return reversed;
	}

	// Function to reverse a string
	public static String reverseString(String s) {
		StringBuilder reversed = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			reversed.append(s.charAt(i)); // Append characters in reverse order
		}
		return reversed.toString();
	}
}
