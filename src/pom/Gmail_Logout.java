package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_Logout {
	 
	@FindBy(xpath="(//span)[3]")
	 private WebElement prlnk;
	
	@FindBy(xpath="//a[.='Sign out']")
	 private WebElement lgbtn;
	
	public Gmail_Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logout() throws InterruptedException
	{
		prlnk.click();
		Thread.sleep(3000);
		lgbtn.click();
		Thread.sleep(3000);
		
	}
	
	

}
