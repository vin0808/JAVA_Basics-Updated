package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Array {
	public static void main(String[] args) {
		Integer[] array1 = { 19, 32, 13, 54 };
		Integer[] array2 = { 31, 24, 51, 67 };

		// Merge arrays without using HashSet
		Integer[] mergedArray = mergeArrays(array1, array2);

		// Print the merged array
		System.out.println("Merged array: " + Arrays.toString(mergedArray));
	}

	public static Integer[] mergeArrays(Integer[] array1, Integer[] array2) {
		List<Integer> mergedList = new ArrayList<>();

		// Add elements from the first array to the list
		for (Integer element : array1) {
			if (!mergedList.contains(element)) {
				mergedList.add(element);
			}
		}

		// Add elements from the second array to the list if they are not already
		// present
		for (Integer element : array2) {
			if (!mergedList.contains(element)) {
				mergedList.add(element);
			}
		}

		// Convert the list back to an array
		Integer[] mergedArray = mergedList.toArray(new Integer[0]);
		return mergedArray;
	}
}