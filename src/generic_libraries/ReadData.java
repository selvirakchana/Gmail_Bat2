package generic_libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class ReadData {
	
	public static ArrayList<String> Read_data(String filename, String sheetn) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream(filename);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetn);
        int roc = sh.getLastRowNum();
        ArrayList<String> l = new ArrayList<>();
                
        for(int i=1;i<=roc;i++) // First Row consist of heading so reading from 2nd row
        {
        	Row r = sh.getRow(i);
        	short cc = r.getLastCellNum();
        	for(int j=0;j<cc;j++)
        	{
        		Cell c = r.getCell(j);
        		String text = c.toString();
        		l.add(text);
        		Reporter.log(text);
           	}
        }
        
        return l;
	}
	
	public static String Read_data1(String filename, String sheetn,int row, int col) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream(filename);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetn);
        Cell c = sh.getRow(row).getCell(col);
        String val = c.toString();
        return val;
	}

	public static String getproper(String path,String key) throws FileNotFoundException, IOException
	{
		 Properties p = new Properties();
		 p.load(new FileInputStream(path));
		 String data = p.getProperty(key);
		 return data;
		
	}
}
