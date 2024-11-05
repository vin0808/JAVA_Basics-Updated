package Hackathon;

import java.util.Scanner;

public class checkbool_val {

	public static void main(String[] args) {

		System.out.println("Enter any three boolean values");
		Scanner obj = new Scanner(System.in);
		boolean a = obj.nextBoolean();
		boolean b = obj.nextBoolean();
		boolean c = obj.nextBoolean();
		obj.close();

		// Check if at least two out of three are true
		if ((a && b) || (b && c) || (a && c)) {
			System.out.println("At least two are true.");
		} else {
			System.out.println("Less than two are true.");
		}
	}

}
