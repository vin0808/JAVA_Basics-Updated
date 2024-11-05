package Day2;

public class Testwrapper {

	public static void main(String[] args) {

		String str1 = "123";

		float a = 30, b = 80;

		int num = Integer.parseInt(str1);
		System.out.println("print string to int conversion: " + num);

		int num1 = 12345678;
		Integer.valueOf(num1);
		System.out.println("print int to Integer conversion: " + num1);

		double num2 = Integer.valueOf(num1);
		System.out.println("Integer to float conversion:  " + num2);

		Integer.toString(num1);
		System.out.println("int to string conversion:  " + num);

		System.out.println("find max of two numbers :  " + Integer.max(num, num1));

		System.out.println("find min of two float values :  " + Float.min(a, b));

	}

}
