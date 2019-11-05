package scripts;


import java.io.IOException;
import java.util.ArrayList;

import generic_libraries.Generic;
import generic_libraries.ReadData;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import pom.Compose_Gmail;
import pom.Gmail_Logout;
import pom.LoginPage_Gmail;
import pom.PasswordPage_Gmail;
import pom.Sent_Gmail;


public class TC003_Gmail_Login_Compose_SentTime_Logout extends Generic {
	
	@Test
	public void test_login() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{    

		
		String filename = "./data/Data.xlsx";
		String sheetn="Sign_Cre";
		
		ArrayList<String> nl = ReadData.Read_data(filename, sheetn);
		 String un=nl.get(0);
		 String pwd=nl.get(1);
		 String tid=nl.get(2);
		 String msg=nl.get(3);
		
		LoginPage_Gmail lg=new LoginPage_Gmail(driver);
		 lg.EnterUname(un);

		 Thread.sleep(5000);
		    
		 PasswordPage_Gmail po= new PasswordPage_Gmail(driver);
		 po.EnterPwd(pwd);
			    
	    Thread.sleep(5000);
	   
        Compose_Gmail co = new Compose_Gmail(driver);
	    co.com_mail(tid, msg);
	    
	    Sent_Gmail smo = new Sent_Gmail(driver);
	    smo.sent_time();
    
	    Gmail_Logout lo = new Gmail_Logout(driver);
	    lo.logout();
	    
	  }
}
	   
	    
