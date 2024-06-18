package com.luma.testcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.luma.base.BaseClass;
import com.luma.pages.RegistrationPage;

public class TC_InvalidRegisterTest extends BaseClass {
	

	@Test(priority=1)
	public void test1() {
		
		TC_LinkTest tc1=new TC_LinkTest();
		tc1.linkTest();
	}
		@Test(priority=2)
		public void test2() throws InterruptedException, IOException {
			
		RegistrationPage rp=new RegistrationPage(driver);
		
		rp.createUser("Apples","Happy","happyapple@agh.com");
		
		rp.userPassword("TesT@1234", "TesT@1234");
		
		rp.createAccount();
		
	
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Luma Screenshots\\InvalidRegister.jpeg");
		FileHandler.copy (src, dest);
		Thread.sleep(3000);
		
					
		driver.close();
		
		}

		

		
}


	


