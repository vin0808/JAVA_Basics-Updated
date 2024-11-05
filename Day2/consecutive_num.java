package Day2;

import java.util.Scanner;

public class consecutive_num {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive natural number N: ");
		int N = scanner.nextInt();

		// Iterate over all possible starting points
		boolean found = false;
		for (int start = 1; start <= N / 2; start++) {
			int sum = 0;

			// Try adding consecutive numbers starting from 'start'
			for (int num = start; sum < N; num++) {
				sum += num;

				// If we find a sum that equals N, print the sequence
				if (sum == N) {
					found = true;
					for (int i = start; i <= num; i++) {
						System.out.print(i + " ");
					}
					System.out.println();
					break; // Break to move to the next starting number
				}
			}
		}

		if (!found) {
			System.out.println("No consecutive numbers found.");
		}

		scanner.close();

		if (!found) {
			System.out.println("No consecutive numbers found.");
		}

		scanner.close();
	}
}
