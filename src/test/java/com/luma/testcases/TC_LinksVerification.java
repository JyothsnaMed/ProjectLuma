package com.luma.testcases;

import org.testng.annotations.Test;

import com.luma.base.BaseClass;
import com.luma.pages.HomePageLinks;

public class TC_LinksVerification extends BaseClass {
	
	@Test
	
	public void test1() {
		TC_LinkTest tc1=new TC_LinkTest();
		tc1.linkTest();
	}
	
	@Test
	
	public void test2() {
		HomePageLinks hp=new HomePageLinks(driver);
		hp.VerifyLinks();
	}
	
	
	
	
}
