package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Draft_Gmail {
	
	 @FindBy(xpath="//a[@title='Drafts']")
	  private WebElement dflnk;
	
	  @FindBy(xpath="//a[@title='Drafts']/../following-sibling::div")
	  private WebElement dfnm;
	   
	  public Draft_Gmail(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	  
	  public void draft_count()
	  {
		  dflnk.click();
		  String drfnm = dfnm.getText();
		  Reporter.log("Number of unread mails:"+drfnm,true);
	  }

}
