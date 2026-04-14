package api.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static FileInputStream inputStream;
	public static XSSFWorkbook workBook;
	public static XSSFSheet excelSheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	/*
	public static String getCellValue(String fielName, String sheetName, int rowNo, int cellNo) {
		try {
			inputStream = new FileInputStream(fielName);
			workBook = new XSSFWorkbook(inputStream);
			excelSheet = workBook.getSheet(sheetName);
			row = excelSheet.getRow(rowNo);
			cell = row.getCell(cellNo);
			String cellValue = cell.getStringCellValue();
			workBook.close();
			return cellValue;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
	}
		}
	*/
	
	public static String getCellValue(String fileName, String sheetName, int rowNo, int cellNo) {
	    try {
	        inputStream = new FileInputStream(fileName);
	        workBook = new XSSFWorkbook(inputStream);
	        excelSheet = workBook.getSheet(sheetName);

	        row = excelSheet.getRow(rowNo);

	        // 🧱 Check if row is null
	        if (row == null) {
	            return "";
	        }

	        cell = row.getCell(cellNo);

	        // 🧱 Check if cell is null
	        if (cell == null) {
	            return "";
	        }

	        // 🧱 Handle different cell types safely
	        switch (cell.getCellType()) {
	            case STRING:
	                return cell.getStringCellValue();

	            case NUMERIC:
	                return String.valueOf(cell.getNumericCellValue());

	            case BOOLEAN:
	                return String.valueOf(cell.getBooleanCellValue());

	            case BLANK:
	                return "";

	            default:
	                return "";
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	        return "";
	    } finally {
	        try {
	            if (workBook != null) workBook.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
	
	
	public static int getRowCount( String fileName, String sheetName) {
		try {
			inputStream = new FileInputStream(fileName);
			workBook = new XSSFWorkbook(inputStream);
			excelSheet = workBook.getSheet(sheetName);
			int rowCount = excelSheet.getLastRowNum() +1;
			workBook.close();
			return rowCount;
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	}
	
	public static int getColumnCount( String fileName, String sheetName) {
		try {
			inputStream = new FileInputStream(fileName);
			workBook = new XSSFWorkbook(inputStream);
			excelSheet = workBook.getSheet(sheetName);
			row = excelSheet.getRow(0);
			int columnCount = row.getLastCellNum();
			workBook.close();
			return columnCount;
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	}
	
		
}
