package com.luma.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.luma.base.BaseClass;
import com.luma.pages.LoginPage;
import com.luma.pages.VerifyFilters;

public class TC_VerifyingFilters extends BaseClass{
	
	public LoginPage lp;
	VerifyFilters page;
	
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
	public void test3() throws InterruptedException {
		VerifyFilters vFilter=PageFactory.initElements(driver, VerifyFilters.class);
		vFilter.sPrice(driver);
		Thread.sleep(3000);
		driver.quit();
		//The sort functionality with price shows only 12 products per page
		//The array was for verification of prices, which also displayed the next page price
	}

}
	


