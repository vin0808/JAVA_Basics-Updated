package Day3;

import java.util.Scanner;

public class Main_method {

	public static void main(String[] args) {
		Scanner scannerobj = new Scanner(System.in);
		Operations operationsobj = new Operations();
		int choice;

		do {
			// Display the menu
			System.out.println("\n--- String Operations Menu ---");
			System.out.println("Enter 1 to Remove given characters from a string");
			System.out.println("Enter 2 to Remove all white spaces from a string");
			System.out.println("Enter 3 to Capitalize the first letter of each word in a string");
			System.out.println("Enter 4 to Find all substrings of a given string");
			System.out.println("Enter 5 to Check if a string is a rotation of another string");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			choice = scannerobj.nextInt();
			scannerobj.nextLine(); // Clear the buffer

			switch (choice) {
			case 1:
				// Remove given characters from a string
				System.out.print("Enter the original string: ");
				String originalStr = scannerobj.nextLine();
				System.out.print("Enter the characters to remove: ");
				String charsToRemove = scannerobj.nextLine();
				System.out.println("Result: " + operationsobj.removeCharacters(originalStr, charsToRemove));
				break;

			case 2:
				// Remove all white spaces from a string
				System.out.print("Enter the string with spaces: ");
				String stringWithSpaces = scannerobj.nextLine();
				System.out.println("Result without spaces: " + operationsobj.removeWhitespaces(stringWithSpaces));
				break;

			case 3:
				// Capitalize the first letter of each word
				System.out.print("Enter the string to capitalize: ");
				String stringToCapitalize = scannerobj.nextLine();
				System.out.println("Capitalized: " + operationsobj.capitalizeFirstLetter(stringToCapitalize));
				break;

			case 4:
				// Find all substrings of a string
				System.out.print("Enter the string to find substrings: ");
				String stringForSubstrings = scannerobj.nextLine();
				operationsobj.findAllSubstrings(stringForSubstrings);
				break;

			case 5:
				// Check if a string is a rotation of another string
				System.out.print("Enter the original string: ");
				String originalRotation = scannerobj.nextLine();
				System.out.print("Enter the rotated string: ");
				String rotatedString = scannerobj.nextLine();
				boolean isRotated = operationsobj.isRotation(originalRotation, rotatedString);
				if (isRotated) {
					System.out.println(rotatedString + " is a rotation of " + originalRotation);
				} else {
					System.out.println(rotatedString + " is not a rotation of " + originalRotation);
				}
				break;

			case 6:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice! Please select a valid option.");
			}
		} while (choice != 6);

		scannerobj.close();
	}
}
