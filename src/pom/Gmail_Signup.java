package pom;



import generic_libraries.WebDriver_Generic;
import generic_libraries.WebElements_Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_Signup {
	
	@FindBy(xpath="//a[contains(.,'Create an account' )]")
    private WebElement sgnbtn;
	
	public Gmail_Signup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void signup(WebDriver driver ) throws InterruptedException
	{
		WebElements_Generic wgo= new WebElements_Generic();
		wgo.Click_Field(sgnbtn);
		
		Thread.sleep(3000);
		
		WebDriver_Generic w = new WebDriver_Generic();
		w.Get_WindowHandles_Tab(driver, 1);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Create your Google Account"));
		
		Thread.sleep(3000);
		
	}
}
