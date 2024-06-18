package com.luma.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.luma.base.BaseClass;
import com.luma.pages.LoginPage;
import com.luma.pages.SearchSuggestions;

public class TC_SearchBoxSuggestions extends BaseClass{
	
	public LoginPage lp;
	SearchSuggestions page;
	
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
		SearchSuggestions sSug=PageFactory.initElements(driver, SearchSuggestions.class);
		sSug.searchSuggestion("Jackets");
		Thread.sleep(3000);
		driver.quit();
	}

}

