package pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Gmail {
	
	   @FindBy(id="identifierId")
	   private WebElement emtbox;
	   
	   @FindBy(id="identifierNext")
	   private WebElement unext;
	   
	  public LoginPage_Gmail(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void EnterUname(String un ) 
	   {
		   		  
		   emtbox.sendKeys(un);
		   unext.click();
	   }
}


