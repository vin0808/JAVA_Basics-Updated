package Day5;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		do {
			System.out.println("Please Enter an Even number\n");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			sc.close();
			try {
				if ((num % 2) == 0) {
					System.out.println("It is an Even number");
					break;
				}

				else {
					System.out.println("it is odd");
				}
			} catch (Exception e) {
				System.out.println("You have entered odd number");
			}
		} while (true);

	}

}
