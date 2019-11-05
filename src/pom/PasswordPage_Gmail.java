package pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage_Gmail {

	
	  @FindBy(name="password")
	   private WebElement pwdtbox;
	   
	   @FindBy(id="passwordNext")
	   private WebElement pnext;
	   
	   public PasswordPage_Gmail(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	 
	   
	   public void EnterPwd(String pwd) 
	   {
		   
		   pwdtbox.sendKeys(pwd);
		   pnext.click();
	   }
}

