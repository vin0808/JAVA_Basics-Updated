package Day6;

import java.util.ArrayList;
import java.util.List;

public class Remove_DuplicateElements_fromaList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(List.of(1, 20, 26, 83, 84, 84, 5));

		// Remove duplicates
		List<Integer> uniqueList = removeDuplicates(list);

		// Print the list after removing duplicates
		System.out.println("List after removing duplicates: " + uniqueList);
	}

	public static List<Integer> removeDuplicates(List<Integer> list) {
		List<Integer> uniqueList = new ArrayList<>();

		for (Integer element : list) {
			// If the element is not already in the uniqueList, add it
			if (!uniqueList.contains(element)) {
				uniqueList.add(element);
			}
		}

		return uniqueList;

	}

}
