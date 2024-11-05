package Day4;

import java.util.Arrays;

public class Move_evnnumtofront {

	public static void moveEvenToFront(int[] arr) {
		int[] result = new int[arr.length]; // To store rearranged array
		int evenIndex = 0; // Pointer for even numbers
		int oddIndex = arr.length - 1; // Pointer for odd numbers (starting from end)

		// Traverse the array and segregate even and odd numbers
		for (int num : arr) {
			if (num % 2 == 0) {
				result[evenIndex++] = num; // Place even numbers from the start
			} else {
				result[oddIndex--] = num; // Place odd numbers from the end
			}
		}

		// Copy result array back into the original array
		System.arraycopy(result, 0, arr, 0, arr.length);
	}

	public static void main(String[] args) {
		int[] myArray = { 11, 0, 1, 5, 3, 7, 15, 2 };

		System.out.println("Original Array: " + Arrays.toString(myArray));
		moveEvenToFront(myArray);
		System.out.println("Array after moving evens to the front: " + Arrays.toString(myArray));
	}

}
