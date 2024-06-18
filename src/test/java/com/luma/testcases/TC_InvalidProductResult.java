package com.luma.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.luma.base.BaseClass;
import com.luma.pages.LoginPage;
import com.luma.pages.SearchInvalidProduct;


public class TC_InvalidProductResult extends BaseClass{
	
		public LoginPage lp;
		SearchInvalidProduct page;
		
		@Test(priority = 1)
		public void test1() {

			TC_LinkTest tc1 = new TC_LinkTest();
			tc1.linkTest();
		}

		@Test(priority=2)
		public void test2() {
		lp=new LoginPage(driver);
		lp.signInCred("happyapple@agh.com","TesT@1234");
		lp.signIn();
		}
		
		
		@Test(priority = 3)
		public void test3() throws InterruptedException, IOException {
			SearchInvalidProduct sIP=PageFactory.initElements(driver, SearchInvalidProduct.class);
			sIP.searchInvalid("Computer");
			Thread.sleep(3000);
			driver.quit();
		}
		
}
	
	
	
	
	

