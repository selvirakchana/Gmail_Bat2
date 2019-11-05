package pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Compose_Gmail {
	
	   @FindBy(xpath="//div[contains(.,'Compose') and @role='button']")
	   private WebElement cmbutton;
	   
	   @FindBy(name="to")
	   private WebElement totbox;
	   
	   @FindBy(name="subjectbox")
	   private WebElement sbtbox;
	   
	   @FindBy(xpath="//div[contains(@class,'Am Al editable')]")
	   private WebElement msgtbox;
	   
	   @FindBy(xpath="//div[contains(.,'Send') and @role='button']")
	   private WebElement sendbutton;
	   
	   public Compose_Gmail(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void com_mail(String tid,String msg) throws InterruptedException 
	   {
		   cmbutton.click();
		   
		   Thread.sleep(10000);
		  		  
		   totbox.sendKeys(tid);
		   
		  Thread.sleep(2000);
		    
		   
		   sbtbox.sendKeys(msg);
		   
		   msgtbox.sendKeys(msg);
		   Thread.sleep(2000);
		   
		   sendbutton.click();
		   
		   Thread.sleep(10000);
		   
	   }
	   
}
