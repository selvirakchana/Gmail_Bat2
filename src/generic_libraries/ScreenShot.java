package generic_libraries;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static void GetScreenShot(WebDriver driver,String tcn) throws IOException {
	    String path="./photos/";
		Date d = new Date(); // Current system date it will capture 
		String d1=d.toString(); // convert from DAte to string 

	    String date=d1.replaceAll(":","-"); // Replace : with - in date 

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(path+tcn+date+".jpeg");
		FileUtils.copyFile(src, dst);
	}

}
