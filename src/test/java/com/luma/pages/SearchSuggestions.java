package com.luma.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.base.BaseClass;

public class SearchSuggestions extends BaseClass{
	
	Action Search;
	public SearchSuggestions(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		Search=new Action();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		}
		
		@FindBy (xpath="//input[@id='search']")
		WebElement sProd;
		@FindBy (xpath="//input[@id='search']")
		WebElement eText;
				
		public void searchSuggest() {
			sProd.click();
		}
		public void enterText(String arg) {
			eText.sendKeys(arg);
		}
		public void searchDrp(WebDriver driver) {
			List<WebElement> searchDrpdwn=driver.findElements(By.xpath("//li[@role='option']"));
			for(int i=0;i<searchDrpdwn.size()-1;i++) {
				System.out.println(searchDrpdwn.get(i).getText());
			}
			}
		public void searchSuggestion(String arg) {
			searchSuggest();
			enterText(arg);
			searchDrp(driver);
		}
	
	

}
