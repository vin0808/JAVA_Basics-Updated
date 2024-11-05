package Day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fileoperations {

	public static void readFileUsingInputStream() throws IOException {
		File file = new File("C:\\Users\\16123\\OneDrive\\Desktop\\teckrk\\data.txt");
		FileInputStream fis = new FileInputStream(file);
		StringBuilder sb = new StringBuilder();
		int ch;
		while ((ch = fis.read()) != -1) {
			sb.append((char) ch);
		}
		fis.close();
		System.out.println(sb);
		System.out.println("------*********************************-----------------");
		System.out.println("Completed reading using i/p stream");
		System.out.println("-------------------------------------------------");

	}

	public static void readDataFromFileUsingReader() throws IOException {

		// String dirpath= System.getProperty("user.dir");
		// System.out.println(dirpath);
		File file = new File("C:\\Users\\16123\\OneDrive\\Desktop\\teckrk\\data.txt");
		FileReader fr = new FileReader(file);
		StringBuilder sb = new StringBuilder();
		int ch;
		while ((ch = fr.read()) != -1) {
			sb.append((char) ch);
		}
		fr.close();
		System.out.println(sb);

		System.out.println("-----------------------");
		System.out.println("Completed Reading using filereader");
		System.out.println("-------------------------------------------------");

	}

	public static void WriteToFileUsingOutputStream() {

		try {
			// String Dirpath=System.getProperty("user.dir");
			File file = new File("C:\\Users\\16123\\OneDrive\\Desktop\\teckrk\\data.txt");

			if (file.isDirectory()) {
				System.out.println("This is a directory, please enter a valid file path");
				// return;
			}

			FileOutputStream fos = new FileOutputStream(file, true);
			String data = "\n Welcome to world\n";
			char[] charArray = data.toCharArray();
			for (char ch : charArray) {
				fos.write(ch);
			}
			fos.flush();
			fos.close();

			System.out.println("completed writing to file using o/p stream");
		} catch (FileNotFoundException ex) {
			System.out.println("FileNotFoundException Occurred, Exception message: " + ex.getMessage());

		} catch (IOException ex) {
			System.out.println("IOException Occurred, Exception message: " + ex.getMessage());

		}
	}

	public static void writeFileByFileWriter() throws IOException {

		File file = new File("C:\\Users\\16123\\OneDrive\\Desktop\\teckrk\\data.txt");
		FileWriter fw = new FileWriter(file, true);
		fw.write("Hello world");
		fw.close();
		System.out.println("completed writing using Filewriter");

	}

	public static void main(String[] args) throws IOException {
		readFileUsingInputStream();
		readDataFromFileUsingReader();
		WriteToFileUsingOutputStream();
		writeFileByFileWriter();
	}

}