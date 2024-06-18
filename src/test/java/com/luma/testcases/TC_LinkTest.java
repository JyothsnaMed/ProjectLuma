package com.luma.testcases;

import org.testng.annotations.Test;

import com.luma.base.BaseClass;

public class TC_LinkTest extends BaseClass {

	@Test
	public void linkTest() {
		
		driver.get("https://magento.softwaretestingboard.com");
		
		String actualTitle=driver.getTitle();
		String expTitle="Home Page";
		if(actualTitle.equals(expTitle))
		{
			System.out.println("Verified Page Title: Pass");
		}
		else
		{
			System.out.println("Verified Page Title: Fail");
		}
		
		
		
		
	}
}
