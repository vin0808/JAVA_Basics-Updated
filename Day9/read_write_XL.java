package Day9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.sl.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.DefaultIndexedColorMap;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_write_XL {

	/*
	 * public static void readSingleData() throws IOException { //String
	 * Dirpath=System.getProperty("user.dir"); FileInputStream fi=new
	 * FileInputStream("C:\\workspace\\Advance_JAVA\\Day9\\config-files\\xldata");
	 * XSSFWorkbook wb=new XSSFWorkbook(fi); XSSFSheet sheet=
	 * wb.getSheet("sep2024");
	 * System.out.println("first row number"+sheet.getFirstRowNum());
	 * System.out.println("last row number"+sheet.getLastRowNum()); XSSFRow
	 * row=sheet.getRow(3); System.out.println( row.getFirstCellNum());
	 * System.out.println(row.getLastCellNum()); XSSFCell cell= row.getCell(0);
	 * 
	 * if(cell.getCellType()== CellType.STRING)
	 * System.out.println(cell.getStringCellValue()); else if(cell.getCellType()==
	 * CellType.NUMERIC) System.out.println(cell.getNumericCellValue());
	 * 
	 * wb.close(); fi.close(); System.out.println("completed");
	 * 
	 * 
	 * }
	 */

	/*
	 * public static void readAllData() throws IOException { String
	 * Dirpath=System.getProperty("user.dir"); FileInputStream fi=new
	 * FileInputStream(new File(Dirpath+"/resources/xldata.xlsx")); XSSFWorkbook
	 * wb=new XSSFWorkbook(fi); XSSFSheet sheet= wb.getSheet("sep2024");
	 * System.out.println("first row number"+sheet.getFirstRowNum());
	 * System.out.println("last row number"+sheet.getLastRowNum()); Iterator<Row>
	 * rows= sheet.rowIterator(); while(rows.hasNext()) { Row row=rows.next();
	 * Iterator<Cell> cells= row.cellIterator(); while(cells.hasNext()) { Cell
	 * cell=cells.next(); switch(cell.getCellType()) { case STRING:
	 * System.out.print(cell.getStringCellValue()+"\t"); break; case NUMERIC:
	 * System.out.print(cell.getNumericCellValue() + "\t"); break; case BOOLEAN:
	 * System.out.print(cell.getBooleanCellValue() + "\t"); break; case FORMULA:
	 * System.out.print(cell.getCellFormula() + "\t"); break; case BLANK:
	 * System.out.print("BLANK\t"); break; default: System.out.print("UNKNOWN\t"); }
	 * } System.out.println();
	 * 
	 * 
	 * }
	 * 
	 * }
	 */

	/*
	 * public static void writeSingleCellDataToFile() throws IOException { String
	 * sheetName = "Sheet2"; int rowIndex = 0; int colIndex = 0; String data =
	 * "Tekarch!"; FileInputStream fileInputStream = new FileInputStream(new
	 * File(System.getProperty("user.dir")+"/resources/xldata.xlsx")); XSSFWorkbook
	 * workbook = new XSSFWorkbook(fileInputStream); // Get the sheet XSSFSheet
	 * sheet = workbook.getSheet(sheetName); XSSFRow row = sheet.createRow(0);
	 * XSSFCell cell = row.createCell(0); cell.setCellValue(data);
	 * fileInputStream.close(); FileOutputStream fileOutputStream = new
	 * FileOutputStream(new
	 * File(System.getProperty("user.dir")+"/resources/xldata.xlsx"));
	 * workbook.write(fileOutputStream); fileOutputStream.close(); workbook.close();
	 * System.out.println("EOP");
	 * 
	 * }
	 */

	public static void writeDataToNewFile() throws IOException {

		// Create a new workbook
		XSSFWorkbook workbook = new XSSFWorkbook();

		// Create a new sheet
		Sheet sheet = workbook.createSheet("2024");

		// Create a cell in the first row and column
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);

		Row row1 = sheet.createRow(1);
		Cell cell1 = row1.createCell(0);

		// Set the cell value as a URL
		cell1.setCellValue("TEKARCH");

		// Set the cell value as a URL
		cell.setCellValue("WWW.GOOGLE.COM");

		// Create a hyperlink style
		XSSFCellStyle hyperlinkStyle = workbook.createCellStyle();
		XSSFFont hyperlinkFont = workbook.createFont();

		// Set font color to blue and underline to single
		hyperlinkFont.setColor(IndexedColors.BLUE.getIndex());
		hyperlinkFont.setUnderline(XSSFFont.U_SINGLE);
		hyperlinkStyle.setFont(hyperlinkFont);

		XSSFCellStyle style = workbook.createCellStyle();

		style.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		// Apply the cell1 style 2 tekarch
		cell1.setCellStyle(style);

		// Apply the style to the cell
		cell.setCellStyle(hyperlinkStyle);

		// Create a hyperlink (type URL)
		XSSFCreationHelper createHelper = workbook.getCreationHelper();
		XSSFHyperlink hyperlink = createHelper.createHyperlink(HyperlinkType.URL);
		hyperlink.setAddress("https://www.google.com");
		cell.setHyperlink(hyperlink);

		FileOutputStream fos = new FileOutputStream(
				new File("C:\\workspace\\Advance_JAVA\\Day9\\config-files\\xldata.xlsx"));
		workbook.write(fos);
		workbook.close();
		fos.close();
		System.out.println("success");

	}

	public static void main(String[] args) throws IOException {
		// readSingleData();
		// readAllData();
		// writeSingleCellDataToFile();
		writeDataToNewFile();
	}

}
