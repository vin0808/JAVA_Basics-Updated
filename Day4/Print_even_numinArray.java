package Day4;

public class Print_even_numinArray {

	public static void printEvenNumbers(int[] arr) {
		for (int num : arr) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}

	}

	public static void main(String[] args) {

		// Sumof_array1 obj=new Sumof_array1();

		int[] array = { 11, 20, 3, 40, 50 };

		printEvenNumbers(array);
	}

}
