package Hackathon;

import java.util.Scanner;

public class Paliandrome {

	public static void main(String[] args) {

		System.out.print("Enter the number of elements in the array: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int len = arr.length;
		// Check if the array is a palindrome
		if (isPalindrome(arr, len)) {
			System.out.println("The array is a palindrome.");
		} else {
			System.out.println("The array is not a palindrome.");
		}
	}

	// Method to check if the array is a palindrome
	public static boolean isPalindrome(int[] arr, int length) {
		int start = 0;
		int end = length - 1;

		// Compare elements from start and end
		while (start < end) {
			if (arr[start] != arr[end]) {
				return false; // If mismatch found, it's not a palindrome
			}
			start++;
			end--;
		}

		return true; // If no mismatches, it's a palindrome
	}

}
