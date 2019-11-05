package generic_libraries;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataProvider_WriteData {



	   @DataProvider(name="Authentication")
	   public static Object[][] getdata() throws EncryptedDocumentException, InvalidFormatException, IOException
	  {
	    FileInputStream fis = new FileInputStream("./excel/data.xlsx");
	   
	    Workbook wb = WorkbookFactory.create(fis);
	 
	    Sheet sh=wb.getSheet("Sheet1");

	    Row row = sh.getRow(0);
	  
	    int rc=sh.getLastRowNum();

	    short cell = row.getLastCellNum();

	    Object[][] data=new Object[rc+1][cell];

	    for(int i=0;i<rc+1;i++)
	    {
	          
	        Row row1=sh.getRow(i);

	        for(int j=0;j<cell;j++)
	        {

	          Cell c=row1.getCell(j);
	  
	          String val=c.toString();

	          data[i][j]=val;
	        }

	     }

	    return data;
	  } 

}
