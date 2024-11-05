package Day6;

import java.util.ArrayList;
import java.util.List;

public class Find_UniqueElements_inaList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(List.of(10, 2, 2, 3, 4, 4, 5));

		// Find unique elements without using HashSet
		ArrayList<Integer> uniqueList = (ArrayList<Integer>) findUniqueElements(list);

		// Print the unique elements
		System.out.println("Unique elements: " + uniqueList);
	}

	public static List<Integer> findUniqueElements(List<Integer> list) {
		ArrayList<Integer> uniqueList = new ArrayList<>();

		for (Integer element : list) {
			// If the element is not already in the uniqueList, add it
			if (!uniqueList.contains(element)) {
				uniqueList.add(element);
			}
		}

		return uniqueList;

	}

}
