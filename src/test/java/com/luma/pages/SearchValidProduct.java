package com.luma.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.luma.base.BaseClass;

public class SearchValidProduct extends BaseClass {
	
	Action Search;
	public SearchValidProduct(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		Search=new Action();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));		
		}
		
		@FindBy (xpath="//input[@id='search']")
		WebElement sProd;
		@FindBy (xpath="//input[@id='search']")
		WebElement eText;
		@FindBy (xpath="//div[@class='actions']/child::button")
		WebElement eBtn;
		@FindBy (xpath="//ol[@class='products list items product-items']//child::li")
		WebElement lProd;
		
		public void enterText(String arg) {
			eText.sendKeys(arg);
		}
		public void clickSearch() {
			eBtn.click();
		}
		public void SearchAProduct(String arg) {
			enterText(arg);
			clickSearch();
			String actual=driver.getTitle();
			String expected="Search results for: 'Jackets for women'";
			Assert.assertEquals(actual, expected, "Search Products Displayed" +arg);
			Search.scrollUsingJavaScriptExecutor(lProd, driver);
		}
		
		
}



