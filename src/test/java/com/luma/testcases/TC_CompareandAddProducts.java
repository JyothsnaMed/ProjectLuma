package com.luma.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.luma.base.BaseClass;
import com.luma.pages.CompareandAddtoWishList;
import com.luma.pages.LoginPage;

public class TC_CompareandAddProducts extends BaseClass {

	public LoginPage lp;
	CompareandAddtoWishList page;
	
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
		CompareandAddtoWishList cAD=PageFactory.initElements(driver, CompareandAddtoWishList.class);
		cAD.CompareandAdd(driver);
		Thread.sleep(3000);
		driver.quit();
	}
	
}
	
	
	
	
	
