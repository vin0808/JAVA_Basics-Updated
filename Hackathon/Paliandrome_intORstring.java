package Hackathon;

public class Paliandrome_intORstring {

	public static void main() {
		String str = "MalayaM";

		char[] char_array = str.toCharArray();

		int i = 0;

		for (char ch : char_array) {

			System.out.println("ch at " + i + " " + " is " + ch);
			i++;
		}

	}
}
