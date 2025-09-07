package utilitypackage;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility {
	
	public static String getTestData(int rowNumber, int cellNumber) throws InvalidFormatException, IOException {
		//Create the file class object
		
		File file = new File("C:\\Users\\Bushra Anjum\\OneDrive\\Desktop\\Testing Workspace\\Testdata.xlsx");
		//Create a workbook class object
		XSSFWorkbook book = new XSSFWorkbook(file);
		//Create a sheet object
	Sheet sheet =	book.getSheetAt(0);
		//Specify the row and cell Number.
	return sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();
	}

}
