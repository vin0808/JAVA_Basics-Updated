package Day4;

public class Calculator {

	// Addition
	public static int add(int a, int b) {
		return a + b;
	}

	// Subtraction
	public static int subtract(int a, int b) {
		return a - b;
	}

	// Multiplication
	public static int multiply(int a, int b) {
		return a * b;
	}

	// Division
	public static double divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Cannot divide by zero");
		}
		return (double) a / b;
	}
}
