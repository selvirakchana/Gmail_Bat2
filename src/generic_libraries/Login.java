package generic_libraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

public class Login implements Auto_Const{
	
	
	public static void login_url(WebDriver driver) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	
	    driver.manage().window().maximize();
	 
	    /* String filename = "./data/Data.xlsx";
		String sheetn="property";
		
		 ArrayList<String> nl = ReadData.Read_data(filename, sheetn);
		 String url=nl.get(0);
		 String wt=nl.get(1);
		 long w = Long.parseLong(wt);
	     driver.get(url);*/
		 
		 /*Properties p = new Properties();
		 p.load(new FileInputStream("./property.properties"));*/
	     
	     
		 String url1 = ReadData.getproper(PROPERTY_FILE, "url");
		 driver.get(url1);
		 	  
		 long wt = Long.parseLong(ReadData.getproper(PROPERTY_FILE, "iw"));
		 
		 System.out.println(wt);
	      
	     driver.manage().timeouts().implicitlyWait(wt, TimeUnit.SECONDS);
	}
}
