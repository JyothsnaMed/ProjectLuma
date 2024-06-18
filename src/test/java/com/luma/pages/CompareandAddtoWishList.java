package com.luma.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.luma.base.BaseClass;

public class CompareandAddtoWishList extends BaseClass {
	
	Action compare;
	
	public CompareandAddtoWishList(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
	compare=new Action();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
	}
	
	@FindBy (xpath="//a[@id='ui-id-6']")
	WebElement sGear;
	@FindBy (xpath="//a[@id='ui-id-25']")
	WebElement sBags;
	@FindBy (xpath="//*[@id=\"compare-clear-all\"]")
	WebElement comClear;
	@FindBy (xpath="/html/body/div[3]/aside[2]/div[2]/footer/button[2]")
	WebElement okBtn;
	@FindBy (xpath="//*[@id=\"wishlist-sidebar\"]/li/div/div/div[2]/div[2]/a")
	WebElement wishClear;
	@FindBy (xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[2]/div/div/strong/a")
	WebElement bProd;
	@FindBy (xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[2]/div/div/div[3]/div/div[2]/a[2]")
	WebElement bCom;
	@FindBy (xpath="//*[@id=\"product-comparison\"]/tbody[1]/tr/td[2]/div[1]/div[2]/a")
	WebElement bRev;
	@FindBy (xpath="//*[@id=\"customer-reviews\"]/div[1]/strong")
	WebElement bReview;
	@FindBy (xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[8]/div/div/strong/a")
	WebElement cProd;
	@FindBy (xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[8]/div/div/div[3]/div/div[2]/a[2]")
	WebElement cCom;
	@FindBy (xpath="//*[@id=\"product-comparison\"]/tbody[1]/tr/td[1]/div[1]/div[2]/a")
	WebElement cRev;
	@FindBy (xpath="//*[@id=\"customer-reviews\"]/div[1]/strong")
	WebElement cReview;
	@FindBy (xpath="//a[@class='action compare primary']")
	WebElement cBtn;
	@FindBy (xpath="//*[@id=\"product-comparison\"]/tbody[2]/tr[2]/th/span")
	WebElement vCom;
	@FindBy (xpath="//*[@id=\"maincontent\"]/div[1]/h1/span")
	WebElement rCom;
	@FindBy (xpath="//*[@id=\"product-comparison\"]/tbody[1]/tr/td[2]/div[3]/div[2]/a")
	WebElement bAdd;
	@FindBy (xpath="//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/h1/span")
	WebElement vAdd;
	
	
	public void CompareandAdd(WebDriver driver) throws InterruptedException {
		compare.MouseHover(sGear, driver);
		sBags.click();
		compare.scrollUsingJavaScriptExecutor(comClear, driver);
		comClear.click();
		Thread.sleep(3000);
		compare.click(okBtn);
		Thread.sleep(3000);
		compare.scrollUsingJavaScriptExecutor(wishClear, driver);
		Thread.sleep(3000);
		wishClear.click();
		Thread.sleep(3000);
		compare.MouseHover(bProd, driver);
		Thread.sleep(3000);
		bCom.click();
		Thread.sleep(3000);
		compare.MouseHover(cProd, driver);
		Thread.sleep(3000);
		cCom.click();
		Thread.sleep(3000);
		cBtn.click();
		Thread.sleep(3000);
		compare.scrollUsingJavaScriptExecutor(vCom, driver);
		Thread.sleep(3000);
		cRev.click();
		Thread.sleep(3000);
		compare.scrollUsingJavaScriptExecutor(cReview, driver);
		Thread.sleep(3000);
		driver.navigate().to("https://magento.softwaretestingboard.com/catalog/product_compare/index/uenc/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9zZWN0aW9uL2xvYWQvP3NlY3Rpb25zPW1lc3NhZ2VzJTJDY3VzdG9tZXIlMkNjb21wYXJlLXByb2R1Y3RzJTJDbGFzdC1vcmRlcmVkLWl0ZW1zJTJDY2FydCUyQ2RpcmVjdG9yeS1kYXRhJTJDY2FwdGNoYSUyQ2luc3RhbnQtcHVyY2hhc2UlMkNwZXJzaXN0ZW50JTJDcmV2aWV3JTJDd2lzaGxpc3QlMkNyZWNlbnRseV92aWV3ZWRfcHJvZHVjdCUyQ3JlY2VudGx5X2NvbXBhcmVkX3Byb2R1Y3QlMkNwcm9kdWN0X2RhdGFfc3RvcmFnZSUyQ3BheXBhbC1iaWxsaW5nLWFncmVlbWVudCZmb3JjZV9uZXdfc2VjdGlvbl90aW1lc3RhbXA9ZmFsc2UmXz0xNzE4Mjg1MTI0MjM1/");
		Thread.sleep(3000);
		bRev.click();
		Thread.sleep(3000);
		compare.scrollUsingJavaScriptExecutor(bReview, driver);
		Thread.sleep(3000);
		driver.navigate().to("https://magento.softwaretestingboard.com/catalog/product_compare/index/uenc/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9zZWN0aW9uL2xvYWQvP3NlY3Rpb25zPW1lc3NhZ2VzJTJDY3VzdG9tZXIlMkNjb21wYXJlLXByb2R1Y3RzJTJDbGFzdC1vcmRlcmVkLWl0ZW1zJTJDY2FydCUyQ2RpcmVjdG9yeS1kYXRhJTJDY2FwdGNoYSUyQ2luc3RhbnQtcHVyY2hhc2UlMkNwZXJzaXN0ZW50JTJDcmV2aWV3JTJDd2lzaGxpc3QlMkNyZWNlbnRseV92aWV3ZWRfcHJvZHVjdCUyQ3JlY2VudGx5X2NvbXBhcmVkX3Byb2R1Y3QlMkNwcm9kdWN0X2RhdGFfc3RvcmFnZSUyQ3BheXBhbC1iaWxsaW5nLWFncmVlbWVudCZmb3JjZV9uZXdfc2VjdGlvbl90aW1lc3RhbXA9ZmFsc2UmXz0xNzE4Mjg1MTI0MjM1/");
		Thread.sleep(3000);
		bAdd.click();
		compare.scrollUsingJavaScriptExecutor(vAdd, driver);
		
		
			
		
	}
	
	
	
	
}
