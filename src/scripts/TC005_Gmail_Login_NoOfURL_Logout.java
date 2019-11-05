package scripts;


import generic_libraries.Generic;
import generic_libraries.ReadData;

import java.io.IOException;






import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import pom.Gmail_Logout;
import pom.LoginPage_Gmail;
import pom.NoOfUrls_Gmail;
import pom.PasswordPage_Gmail;

public class TC005_Gmail_Login_NoOfURL_Logout extends Generic {
	
	@Test
	public void test_login() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{    

		String filename = "./data/Data.xlsx";
		String sheetn="Sign_Cre";
		
		ArrayList<String> nl = ReadData.Read_data(filename, sheetn);
		 String un=nl.get(0);
		 String pwd=nl.get(1);
		
		LoginPage_Gmail lg=new LoginPage_Gmail(driver);
		 lg.EnterUname(un);

		 Thread.sleep(5000);
		    
		 PasswordPage_Gmail po= new PasswordPage_Gmail(driver);
		 po.EnterPwd(pwd);
	    
	    
	    Thread.sleep(5000);
	    
	    NoOfUrls_Gmail nuo= new NoOfUrls_Gmail(driver);
	    nuo.no_urls();
	    
   
	    Gmail_Logout lo = new Gmail_Logout(driver);
	    lo.logout();
	    
	  }
}
	   
	    
