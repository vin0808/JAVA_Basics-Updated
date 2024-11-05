package Hackathon;

import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) {
		// Input string
		System.out.println("Please enter the string with space");
		Scanner obj = new Scanner(System.in);

		String input = obj.nextLine();
		obj.close();

		// Convert the string into a character array
		char[] charArray = input.toCharArray();

		// Use StringBuilder to efficiently concatenate characters
		StringBuilder reversed = new StringBuilder();

		// Use enhanced for loop to iterate through the char array
		for (char c : charArray) {
			reversed.insert(0, c); // Prepend each character to the StringBuilder
		}

		// Output the reversed string by converting StringBuilder to a string
		System.out.println("Reversed String: " + reversed.toString());
	}
}
