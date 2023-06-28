package vTiger.Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step 1 : Open the document in java readableformat
		FileInputStream fis =new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		
		//Step 2 : Create the workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		//Step 3 : Get the control of sheet
		Sheet sh = wb.getSheet("Contact");
		
		//Step 4 : Get the control of Row
		Row rw = sh.createRow(11);
		
		//Step 5 : Get the control of cell
		Cell cl = rw.createCell(7);
		
		//Step 6 : Set value in the cell
		cl.setCellValue("Batman");
		
		//Step 7 : open the document in writable format
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
		
		//Step 8 : write data into workbook
		wb.write(fos);
		
		//Step 9 : Close the workbook
		wb.close();
		System.out.println("Data added into the excel sheet");
		
		
		

	}

}
