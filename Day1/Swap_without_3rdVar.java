package Day1;

import java.util.*;

public class Swap_without_3rdVar {

	public static void main(String[] args) {

		int a, b;
		System.out.println("Enter any two numbers");
		System.out.println("\n");

		Scanner SC = new Scanner(System.in);
		a = SC.nextInt();
		b = SC.nextInt();

		a = a * b;
		b = a / b;
		a = a / b;

		System.out.print("Swapped numbers are :" + " " + a + " " + b + " ");

		SC.close();
	}

}
