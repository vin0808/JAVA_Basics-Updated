package Day6;

import java.util.ArrayList;
import java.util.Arrays;

public class Compare_Two_ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "D"));
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList("A", "B", "D"));

		// Compare using equals method
		boolean isEqual = list1.equals(list2);

		System.out.println("Are the ArrayLists equal? " + isEqual);
	}

}
