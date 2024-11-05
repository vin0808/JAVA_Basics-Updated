package Day4;

public class Paliandrome {

	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;

			}
			left++;
			right--;
		}
		return true;

	}

	public static void main(String[] args) {

		String array = "welew";

		System.out.print(Paliandrome.isPalindrome(array));

	}

}
