package com.luma.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.luma.base.BaseClass;
import com.luma.pages.HomePageLinks;

public class TC_ValidateMainElements extends BaseClass {
	
	
	@Test
	
	public void test1() {
		TC_LinkTest tc1=new TC_LinkTest();
		tc1.linkTest();
	}
	
	@Test
	
	public void test2() {
		HomePageLinks hp=new HomePageLinks(driver);
		hp.validateText();
	}
	
	@Test
	

	public void test3() throws InterruptedException {
		HomePageLinks hp=new HomePageLinks(driver);
		int expect=6;
		int actual=hp.elementsCount();
		Thread.sleep(3000);
		Assert.assertEquals(actual, expect);
	}
	
}
