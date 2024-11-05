package Day4;

public class Find_maxofArrayele {

	public static int maxofArray(int[] arr) {
		int max = arr[0];
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

	public static void main(String[] args) {

		// Sumof_array1 obj=new Sumof_array1();

		int[] array = { 10, 20, 300, 40, 50 };

		int max = Find_maxofArrayele.maxofArray(array);

		System.out.println("sum of array is: " + max);

	}

}
