package Day1;

import java.util.*;

public class Find_Largestof_3num {

	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);

		// reading input from the user
		System.out.println("Enter the first number:");
		int a = SC.nextInt();
		System.out.println("Enter the second number:");
		int b = SC.nextInt();
		System.out.println("Enter the third number:");
		int c = SC.nextInt();
		int largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		System.out.println("The largest number is: " + largest);

		SC.close();
	}
}
