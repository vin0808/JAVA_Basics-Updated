package Hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_integerArray {

	public static void main(String[] args) {

		// Input array size
		System.out.print("Enter the number of elements in the array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// sc.close();

		// Create the array
		int[] arr = new int[n];

		// Input array elements
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Sort the array using Arrays.sort()
		Arrays.sort(arr);

		// Display the sorted array
		System.out.println("Sorted array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}
