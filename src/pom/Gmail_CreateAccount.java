package pom;

import generic_libraries.ReadData;
import generic_libraries.WebElements_Generic;

import java.io.IOException;
import java.util.ArrayList;





import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_CreateAccount {
	
	@FindBy(id="firstName")
	private WebElement fntxt;
	
	@FindBy(id="lastName")
	private WebElement lntxt;
	
	@FindBy(id="username")
	private WebElement untxt;
	
	@FindBy(name="Passwd")
	private WebElement pwd;
	
	@FindBy(name="ConfirmPasswd")
	private WebElement cpwd;
	
	@FindBy(xpath="(//span[.='Next'])[2]")
	private WebElement nxtbtn;
	
	public Gmail_CreateAccount(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	 public void CreateAccount(String filename, String sheetn) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		 
		 ArrayList<String> nl = ReadData.Read_data(filename, sheetn);
		 String fn=nl.get(0);
		 String ln=nl.get(1);
		 String un=nl.get(2);
		 String pw= nl.get(3);
		 
		 WebElements_Generic we = new WebElements_Generic();
		 
		 we.Send_Keys(fntxt, fn);
		 
		 we.Send_Keys(lntxt, ln);
		 
		 we.Send_Keys(untxt, un);
		 
		 we.Send_Keys(pwd, pw);
		 
		 we.Send_Keys(cpwd, pw);
		 
		 Thread.sleep(3000);
		 
		 we.Click_Field(nxtbtn);
		 
		 Thread.sleep(3000);
	 }
}
