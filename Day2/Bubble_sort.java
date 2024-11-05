package Day2;

public class Bubble_sort {

	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 8 };

		bubbleSort(array);

		System.out.println("Sorted array:");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

	// Bubble Sort method
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap arr[j] and arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
