package Day2;

import java.util.Scanner;

public class Sqnsearch {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 5, 7, 2 };

		System.out.print("Enter the element to search: ");

		Scanner SC = new Scanner(System.in);
		int target = SC.nextInt();

		// sequential search
		int index = sequentialSearch(arr, target);

		// Check if element found
		if (index == -1) {
			System.out.println("Element not found in the array.");
		} else {
			System.out.println("Element found at " + index + " place");
		}
		SC.close();
	}

	// Sequential search method
	public static int sequentialSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i + 1; // Return the index if the element is found
			}
		}
		return -1; // Return -1 if the element is not found
	}
}
