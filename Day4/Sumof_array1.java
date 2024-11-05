package Day4;

public class Sumof_array1 {

	public static int sumOfArray(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return sum;
	}

	public static void main(String[] args) {

		// Sumof_array1 obj=new Sumof_array1();

		int[] array = { 10, 20, 30, 40, 50 };

		int sum = Sumof_array1.sumOfArray(array);

		System.out.println("Sum of array is :" + sum);

	}

}
