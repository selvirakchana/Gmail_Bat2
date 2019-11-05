package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Sent_Gmail {
	
	@FindBy(xpath="//a[.='Sent']")
	   private WebElement sbutton;
	
	@FindBy(xpath="//span[@name='me']/ancestor::tbody[1]/tr[1]//div[contains(.,'To')]")
	   private WebElement smail;
	
	@FindBy(xpath="(//span[@role=\"gridcell\"])[2]")
	   private WebElement setm;
	
	public Sent_Gmail(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	
	public void sent_time() throws InterruptedException
	{
		sbutton.click();
		Thread.sleep(10000);
		smail.click();
		String stime = setm.getText();
		Reporter.log("Sent time of the mail:"+stime,true);
		
	}

}
