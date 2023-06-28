package vTiger.Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Step 1: Open the document in java readable format using file input stream
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		
		//Step 2 : Create a workbook using using workbook factory
		Workbook wb = WorkbookFactory.create(fis);
		
		//step 3 : Get the control of sheet
		Sheet sh = wb.getSheet("Organization");
		
		//Step 4 : Get the control of row
		Row rw = sh.getRow(1);
		
		//step 5 : Get the control of cell
		Cell cl = rw.getCell(2);
		
		//step 6 : Read the data from the cell
		String value = cl.getStringCellValue();
		System.out.println(value);
		
		//step 7 : Close the workbook
		wb.close();
		
		
		

	}

}
