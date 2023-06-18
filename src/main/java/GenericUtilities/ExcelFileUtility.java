package GenericUtilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class consists of generic utilities related to excel file
 * @author Sanjot
 *
 */

public class ExcelFileUtility {
	
	/**
	 * This method will read the data from excel sheet
	 * @param  
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 * 
	 * 
	 */
	public String readDataFromExcel(String sheetName,int rowNO, int cellNo) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream(ConstantsUtility.excelFilePath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row rw=sh.getRow(rowNO);
		Cell cl = rw.getCell(cellNo);
		String value = cl.getStringCellValue();
		wb.close();
		return value;
	
	}
	
}
