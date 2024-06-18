package com.luma.testcases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.luma.base.BaseClass;
import com.luma.pages.AddToCartandValidate;
import com.luma.pages.LoginPage;

public class TC_AddToCartandValidateTest extends BaseClass {
	
	AddToCartandValidate page;
	public LoginPage lp;
	
	@Test(priority=1)
	public void test1() {		
		TC_LinkTest tc1=new TC_LinkTest();
		tc1.linkTest();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		page=new AddToCartandValidate(driver);
	}	
	
	@Test(priority=2)
	public void test2() {
	lp=new LoginPage(driver);
	lp.signInCred("happyapple@agh.com","TesT@1234");
	lp.signIn();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}
	
	@Test(priority=3)
	public void test3() throws InterruptedException {
		Assert.assertTrue(page.validateAddtoCart(driver));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.quit();
	}
	
}
