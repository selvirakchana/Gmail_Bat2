package generic_libraries;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class PopUp_Generic {
	     
	  public void Alert_Accept(Alert a)
	  {
		  a.accept();
	  }
	  public void Alert_Dismiss(Alert a)
	  {
		  a.dismiss();
	  }
	  public String Alert_GetText(Alert a)
	  {
		  String text = a.getText();
		  return text;
	  }
	  public void Alert_SendKeys(Alert a, String val)
	  {
		  a.sendKeys(val);
	  }
	  public void Download_Save(WebElement ele) throws InterruptedException, AWTException
	  {
		  ele.sendKeys(Keys.ENTER);
		  Thread.sleep(2000);

		  Robot r=new Robot();

		  r.keyPress(KeyEvent.VK_ALT);
		  r.keyPress(KeyEvent.VK_S);

		  r.keyRelease(KeyEvent.VK_ALT);
		  r.keyRelease(KeyEvent.VK_S);

		  Thread.sleep(2000);
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
	  }
	  public void Download_Open(WebElement ele) throws InterruptedException, AWTException
	  {
		  ele.sendKeys(Keys.ENTER);
		  Thread.sleep(2000);
		  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
	  }
	  public void Download_Cancle(WebElement ele) throws InterruptedException, AWTException
	  {
		  ele.sendKeys(Keys.ENTER);
		  Thread.sleep(2000);

		  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_ESCAPE);
		  r.keyRelease(KeyEvent.VK_ESCAPE);
	  }
      public void Upload_File(WebElement ele, String filepath)
      {
    	  ele.sendKeys(filepath);
      }
      public void Upload_Cancel() throws AWTException
      {
    	  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_ESCAPE);
		  r.keyRelease(KeyEvent.VK_ESCAPE);
      }
}
