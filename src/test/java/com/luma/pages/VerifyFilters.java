package com.luma.pages;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.base.BaseClass;

	
public class VerifyFilters extends BaseClass{
	
	Action Finder;
	public VerifyFilters(WebDriver driver) {	
		PageFactory.initElements(driver, this);
		Finder=new Action();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}
	
	@FindBy (xpath="//a[@id='ui-id-5']")
	WebElement fMen;
	@FindBy (xpath="//div[@class='categories-menu']/descendant::a[1]")
	WebElement fHood;
	@FindBy (xpath="//select[@id='sorter']")
	WebElement soProd;
	@FindBy (xpath="//option[@value='price']")
	WebElement soPrice;
	@FindBy (xpath="//span[@class='price']")
	WebElement pPrice;
	
	
	public void sPrice(WebDriver driver) {
	
	fMen.click();
	fHood.click();
	soProd.click();
	soPrice.click();
	Finder.scrollUsingJavaScriptExecutor(pPrice, driver);
	List<WebElement> hPrice=driver.findElements(By.xpath("//span[@class='price']"));
	for(int i=0;i<hPrice.size();i++) {
		String text = hPrice.get(i).getText();
		
		System.out.println(text);
		}
	String[] Hoodies={"$74.00", "$69.00", "$64.00", "$62.00", "$69.00", "$42.00", "$54.00", "$42.00", "$52.00", "$60.00", "$63.00", "$70.00"};
	Arrays.sort(Hoodies);
	System.out.println(Arrays.toString(Hoodies));
  }
}
