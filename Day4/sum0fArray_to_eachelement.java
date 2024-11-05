package Day4;

public class sum0fArray_to_eachelement {

	public static void addSumToEachElement(int[] arr) {
		int sum = sumOfArray(arr);
		for (int i = 0; i < arr.length; i++) {
			arr[i] += sum;
			System.out.println(arr[i]);
		}
		System.out.println(arr);
		// return arr;
	}

	public static int sumOfArray(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return sum;
	}

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50 };

		// System.out.println(sumOfArray(array));

		addSumToEachElement(array);

	}

}
