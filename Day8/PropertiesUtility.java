package Day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {

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
			fis.close();

		} catch (FileNotFoundException e) {
			System.out.println("error in the file path.. please try again");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("error in loading the file in properties object");
			e.printStackTrace();
		}

		return data;
	}

	// writing the property
	// deleting the property
	// get all property name

}
