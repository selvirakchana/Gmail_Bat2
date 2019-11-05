package generic_libraries;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {

	public static void Write_data(int rc,int ce,String msg, String sheetn,String filen) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream(filen);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetn);
		Row r = sh.createRow(rc);
		Cell c = r.createCell(ce);
		c.setCellValue(msg);
		FileOutputStream fos = new FileOutputStream(filen);
		wb.write(fos);
	}

}
