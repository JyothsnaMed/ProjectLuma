package com.luma.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.base.BaseClass;

public class HomePageLinks extends BaseClass {

	public HomePageLinks(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (tagName="a")
	List<WebElement> links;

	
	@FindBy (xpath="//ul[@id='ui-id-2']/child::li/child::a")
	List<WebElement> mainElements;
	

	public void VerifyLinks() {
				
		int totalLinks=links.size();
		System.out.println(totalLinks);
		
		for(WebElement elements:links) {
			System.out.println(elements.getText());
		}
	}
	
	public int elementsCount() {
		int size=mainElements.size();
		return size;
		
	}
	
	public void validateText() {
		for(WebElement element:mainElements)
		{
			System.out.println(element.getText());
			
		}	
		
		
	}

	
}
