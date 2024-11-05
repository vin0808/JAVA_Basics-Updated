package Day4;

public class Longest_paliandrome {

	public static String longestPalindrome(String str) {
		String longest = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String substring = str.substring(i, j);
				if (isPalindrome(substring) && substring.length() > longest.length()) {
					longest = substring;
				}
			}
		}
		return longest;
	}

	private static boolean isPalindrome(String str) {
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

		String array = "WelcomemocleWWelcomwWelcomwe";

		System.out.println(longestPalindrome(array));

	}

}
