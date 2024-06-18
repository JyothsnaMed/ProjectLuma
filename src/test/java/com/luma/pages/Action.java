package com.luma.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.luma.base.BaseClass;

public class Action extends BaseClass {
	
	Actions action;
		
	public void scrollUsingJavaScriptExecutor(WebElement element, WebDriver driver) {
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
		scroll.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public void MouseHover(WebElement element, WebDriver driver) {
		action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	
	public void MouseClick (WebElement element, WebDriver driver) {
		action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void clear(WebElement element) {
		element.clear();
	}
	
	public void setText(String text, WebElement element) {
		element.sendKeys(text);
	}
	public void clickUsingJavaScriptExecutor(WebElement element, WebDriver driver) {
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0], click();", element);
	}
	public void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}

	public boolean validateText(WebDriver driver, WebElement element, String expectedText) {
		String actualText=element.getText();
		if(actualText.equals(expectedText)) {
			return false;
		} else {
			return true;
		}
	
	}
	
}
