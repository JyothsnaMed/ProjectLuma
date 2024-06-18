package com.luma.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.luma.base.BaseClass;
import com.luma.pages.LoginPage;


public class TC_LogInTest extends BaseClass {
	
	public LoginPage lp;
	@Test(priority=1)
	public void test1() {
		TC_LinkTest tc1=new TC_LinkTest();
		tc1.linkTest();
		
	}
	@Test(priority=2)
	public void test2() {
		lp=new LoginPage(driver);
		String title=lp.validateLoginPageTitle();
		Assert.assertEquals(title, "Home Page");
		
	}
	
	@Test(priority=3)
	public void test3() {
		lp=new LoginPage(driver);
		boolean flag = lp.validatePageLogo();
		Assert.assertTrue(flag);
		
	}
	
	
	@Test(priority=4)
	public void test4() {
	lp=new LoginPage(driver);
	lp.signInCred("happyapple@agh.com","TesT@1234");
	lp.signIn();
		
	}
	
	
	@Test(priority=5)
	public void test5() throws InterruptedException {
	lp=new LoginPage(driver);
	Thread.sleep(3000);
	
	String actualUserID=lp.accountVerify();
	System.out.println("Actual UserID: "+actualUserID);
	
	String expectedUserID="Welcome, Apples Happy!";
	System.out.println("Expected UserID: "+expectedUserID);
	
	
	Assert.assertEquals(actualUserID, expectedUserID);
	
	}
	
	
	
}
