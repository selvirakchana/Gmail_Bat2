package pom;



import generic_libraries.WriteData;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoOfUrls_Gmail {
	
	@FindBy(xpath="//a1")
	   private List<WebElement> alnk;
	
	public NoOfUrls_Gmail(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	
	public void no_urls() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		int i=0;
		for(WebElement we:alnk)
		{
			
			String utxt = we.getAttribute("href");
			WriteData.Write_data(i,0,utxt,"Sheet1", "./data/TestData.xlsx");
			i++;
		}
	}
	

}
