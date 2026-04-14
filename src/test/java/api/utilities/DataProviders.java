package api.utilities;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name = "userCredentialData")
	public String [][] allDataProvider(){
		String fileName = System.getProperty("user.dir") + "//TestDataExcel//TestDataexcel.xlsx";
		int totalRows = ReadExcelFile.getRowCount(fileName, "Sheet1");
		int totalColumns = ReadExcelFile.getColumnCount(fileName, "Sheet1");
		
		String  authCredData[][] = new String[totalRows-1][totalColumns];
		
		for (int rowNo = 1; rowNo<totalRows; rowNo++)
		{
			for( int colNn = 0; colNn<totalColumns; colNn++)
			{
				authCredData[rowNo-1][colNn] = ReadExcelFile.getCellValue(fileName, "Sheet1", rowNo, colNn);
			}
		}
		return authCredData;
	}
	
	
}
