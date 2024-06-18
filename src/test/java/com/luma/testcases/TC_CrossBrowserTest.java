package com.luma.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_CrossBrowserTest{
	WebDriver driver;
	@Parameters("Browser")
	@Test
	public void launchBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		
	}
	@Test
	public void url() 
	{
			driver.get("https://magento.softwaretestingboard.com");
	}
}
