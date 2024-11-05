package Day6;

import java.util.ArrayList;
import java.util.List;

public class remove_alloccurances_ofanumber {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(List.of(1, 9, 2, 3, 8, 8, 9));

		// Remove all occurrences of value 4
		List<Integer> modifiedList = removeAllOccurrences(list, 9);

		System.out.println("List after removing value 4: " + modifiedList);
	}

	public static <T> List<T> removeAllOccurrences(List<T> list, T value) {
		list.removeIf(element -> element.equals(value));
		return list;
	}

}
