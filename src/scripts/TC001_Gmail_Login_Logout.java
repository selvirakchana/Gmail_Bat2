package scripts;

import java.io.IOException;
import java.util.ArrayList;

import generic_libraries.Auto_Const;
import generic_libraries.Generic;
import generic_libraries.ReadData;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import pom.Gmail_Logout;
import pom.LoginPage_Gmail;
import pom.PasswordPage_Gmail;


public class TC001_Gmail_Login_Logout extends Generic implements Auto_Const {
	
	@Test
	public void test_login() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{    

		//String filename = "./data/Data.xlsx";
		String sheetn="Sign_Cre";
		
		 ArrayList<String> nl = ReadData.Read_data(EXCEL_PATH1, sheetn);
		 String un=nl.get(0);
		 String pwd=nl.get(1);
		 
		 
		
		LoginPage_Gmail lg=new LoginPage_Gmail(driver);
		lg.EnterUname(un);

	    Thread.sleep(5000);
	    
	    PasswordPage_Gmail po= new PasswordPage_Gmail(driver);
	    po.EnterPwd(pwd);
	    
	    Thread.sleep(5000);
	    
	     
	   
	    Gmail_Logout lo = new Gmail_Logout(driver);
	    lo.logout();
	    
	  }
}
	   
	    
