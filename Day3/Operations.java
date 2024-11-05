package Day3;

public class Operations {

	// Method to remove given characters from a string
	public String removeCharacters(String str, String charsToRemove) {

		// StringBuilder newstring=new StringBuilder();

		for (char ch : charsToRemove.toCharArray()) {

			// newstring.d

			str = str.replace(Character.toString(ch), "");
		}
		return str;
	}

	// Method to remove all whitespaces from a string
	public String removeWhitespaces(String str) {
		return str.replaceAll("\\s+", "");
	}

	// Method to capitalize the first letter of each word
	public String capitalizeFirstLetter(String str) {
		String[] words = str.split("\\s+"); // Split the string by spaces
		StringBuilder capitalized = new StringBuilder();

		for (String word : words) {
			if (word.length() > 0) {
				capitalized.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase())
						.append(" ");
			}
		}

		return capitalized.toString().trim(); // Return the final result after trimming extra space
	}

	// Method to find all substrings of a given string
	public void findAllSubstrings(String str) {
		System.out.println("All substrings of \"" + str + "\":");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

	// Method to check if a string is a rotation of another string
	public boolean isRotation(String original, String rotated) {
		if (original.length() != rotated.length()) {
			return false;
		}
		// Concatenate the original string with itself and check if rotated string is a
		// substring
		String concatenated = original + original;
		return concatenated.contains(rotated);
	}
}
