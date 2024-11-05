package Day3;

import java.util.Arrays;

public class Stringoperations {

	public static void main(String[] args) {

		// Array to string
		int[] intarray;
		intarray = new int[3];
		intarray[0] = 20;
		intarray[1] = 40;
		intarray[2] = 90;
		String arraytostring = Arrays.toString(intarray);

		System.out.println(arraytostring);

		// string to integer

		String str = "120";
		int num;
		System.out.println(num = Integer.parseInt(str));

		//
	}

}
