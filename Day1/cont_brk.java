package Day1;

public class cont_brk {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.println("print " + i);
			if (i == 5)
				break;

		}

		System.out.println("-------------------------------------");

		for (int i = 0; i <= 10; i++) {
			System.out.println("printing before entering if condition " + i);

			if (i == 5) {
				System.out.println("do not print ");
				System.out.println("-------------------------------------");
				continue;
			}
			System.out.println("print " + i);
			System.out.println("-------------------------------------");

		}

	}

}
