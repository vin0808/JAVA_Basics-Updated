package Day6;

import java.util.ArrayList;
//import java.util.Arrays;

public class Store_ArrayElements_toArrayList {

	public static void main(String[] args) {

		// Array to be converted
		// String[] array = {"A", "B", "C", "D"};

		// Create ArrayList from Array
		// ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("abcd");
		arrayList.add("bbbb");
		arrayList.add("fjffmb");
		arrayList.add("bghdjki");

		// Print ArrayList
		System.out.println("ArrayList: " + arrayList);

	}

}
