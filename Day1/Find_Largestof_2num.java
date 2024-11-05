package Day1;

import java.io.IOException;

import Day8.PropertiesUtility;

public class Find_Largestof_2num {

	public static void main(String[] args) throws IOException {

		String path = "C:\\workspace\\Advance_JAVA\\Day8\\config-files\\Utility_file.properties";
		String a1 = PropertiesUtility.readDataFromPropertyFile(path, "id1");
		String b1 = PropertiesUtility.readDataFromPropertyFile(path, "id2");

		int a = Integer.parseInt(a1);
		int b = Integer.parseInt(b1);

		int largest = (a > b) ? a : b;
		System.out.println("The largest number is: " + largest);

		int sum = (a + b);
		System.out.println("Sum of two numbers is: " + sum);

	}

}

/*
 * private static String getAValueFromLocalFile(String keyName) throws
 * IOException {
 * 
 * File file=new
 * File("C:\\workspace\\Advance_JAVA\\Day8\\config-files\\values.properties");
 * FileInputStream fis=new FileInputStream(file);
 * 
 * Properties pro=new Properties(); pro.load(fis);
 * System.out.println(pro.getProperty(keyName)); String
 * value=pro.getProperty(keyName);
 * 
 * 
 * return value;
 */
