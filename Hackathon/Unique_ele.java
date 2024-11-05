package Hackathon;

import java.util.HashMap;
import java.util.Scanner;

public class Unique_ele {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt(); // Input array size

		int[] arr = new int[n];

		// Input array elements
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// method to find and print unique
		findunique(arr);

		// find duplicate numbers
		findduplicates(arr);
	}

	// Method to find unique numbers and count duplicates

	static void findunique(int[] arr) {

		// HashMap initalizing
		HashMap<Integer, Integer> frequencyMap = new HashMap<>();

		// Populate the frequency map with the array elements
		for (int num : arr) {

			// System.out.println("Frequencymap: "+frequencyMap.getOrDefault(num, 0)+1);
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		// Print unique numbers (those with frequency 1)
		System.out.println("Unique number is :");
		for (int num : frequencyMap.keySet()) {
			if (frequencyMap.get(num) == 1) {
				System.out.println(num);
			}
		}

	}

	static void findduplicates(int[] array) {

		HashMap<Integer, Integer> frequencyMap = new HashMap<>();

		// Populate the frequency map with the array elements
		for (int num : array) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		// Print duplicate numbers (those with frequency greater than 1)
		System.out.println("Duplicate numbers:");
		boolean hasDuplicates = false;
		for (int num : frequencyMap.keySet()) {
			if (frequencyMap.get(num) > 1) {
				System.out.println(num + " occurs " + frequencyMap.get(num) + " times");
				hasDuplicates = true;
			}
		}

		if (!hasDuplicates) {
			System.out.println("No duplicates found.");
		}
	}

}
