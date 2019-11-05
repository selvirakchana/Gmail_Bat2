package generic_libraries;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic implements Auto_Const {
	
	     static {
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		
	     }
	     public WebDriver driver;
	     
	     /*  @Parameters({"browser"})
	    @BeforeMethod	
	   public void Open_App(String browser) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	     {
	    	if (browser.equals("firefox"))
	    	{
	    	 driver=new FirefoxDriver();
	    	 Login.login_url(driver);
	    	}
	    	
	    	else
	    	{
	    	 driver=new ChromeDriver();
	    	 Login.login_url(driver);
	    	}
	    	
	     }*/
	     
	     @BeforeMethod
	     public void Open_App() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	     {
	    	 driver=new FirefoxDriver();
	    	 Login.login_url(driver);
	     }
	     
	    
	    
	    
	     @AfterMethod
	     public void close_App(ITestResult res) throws IOException
	     {
	    	int status = res.getStatus();
	    	if (status==ITestResult.FAILURE)
	    	{
	    		String tcn = res.getTestName();
	    		ScreenShot.GetScreenShot(driver, tcn);
	    	}
	    	driver.quit(); 
	     }
	            
}
