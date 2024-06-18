package com.luma.pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.luma.base.BaseClass;

public class SearchInvalidProduct extends BaseClass {
	
	Action Invalid;
	public SearchInvalidProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		Invalid=new Action();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}
	
	@FindBy (xpath="//input[@id='search']")
	WebElement sBox;
	@FindBy (xpath="//input[@id='search']")
	WebElement sText;
	@FindBy (xpath="//button[@title='Search']")
	WebElement sBtn;
	
	public void searchBox() {
		sBox.click();
	}
	public void searchText(String arg) {
		sText.sendKeys(arg);
	}
	public void searchButton() {
		sBtn.click();
	}
	public void searchInvalid(String arg) throws IOException, InterruptedException {
		searchBox();
		searchText(arg);
		searchButton();
		String actual=driver.getTitle();
		String expected="Search results for: 'Computer'";
		Assert.assertEquals(actual, expected, "Search results for: 'Computer'");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Luma Screenshots\\InvalidProduct.jpeg");
		FileHandler.copy (src, dest);
		Thread.sleep(3000);
						
	}
	

}
