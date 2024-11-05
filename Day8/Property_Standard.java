package Day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property_Standard {

	public static String readDataFromPropertyFile(String path, String key) {
		// need property file
		// what property (key)

		File file = new File(path);
		FileInputStream fis = null;
		Properties pro = new Properties();
		String data = null;
		try {
			fis = new FileInputStream(file);
			pro.load(fis);
			data = pro.getProperty(key);

			if (data != null) {
				System.out.println("The value for key '" + key + "' is: " + data);
			} else {
				System.out.println("Key '" + key + "' not found in the properties file.");
			}

			fis.close();

		} catch (FileNotFoundException e) {
			System.out.println("error in the file path.. please try again");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("error in loading the file in properties object");
			e.printStackTrace();
		}

		// return data;
		System.out.println(data);
		return data;

		// writing the property
		// deleting the property
		// get all property name

	}

	public void main() {
		String path = "C:\\workspace\\Advance_JAVA\\Day8\\config-files";
		String key = "id";
		System.out.println(readDataFromPropertyFile(path, key));

	}
}
