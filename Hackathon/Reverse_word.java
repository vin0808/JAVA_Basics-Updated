package Hackathon;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Reverse_word {

	public static void main(String[] args) {

		// Input string
		String input = "Java Code";

		// Split the input string into words using space as a delimiter
		String[] wordsArray = input.split(" ");

		// System.out.println("words array " + wordsArray[0]);

		// Convert the array to a List so we can use Collections.reverse()
		List<String> words = Arrays.asList(wordsArray);

		// Reverse the list of words
		Collections.reverse(words);

		// Use StringBuilder to efficiently concatenate words
		StringBuilder reversed = new StringBuilder();

		// Use enhanced for loop to iterate through the reversed list of words
		for (String word : words) {
			reversed.append(word).append(" ");
		}

		//

		System.out.println("appended words: " + words);

		// Trim the extra space at the end and output the reversed words
		System.out.println("Reversed Words: " + reversed.toString().trim());
	}

}
