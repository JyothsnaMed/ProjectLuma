package com.luma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.base.BaseClass;

public class InvalidLogin extends BaseClass {
	
	public InvalidLogin (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//div[@class='panel header']/descendant::li[2]/descendant::a[1]")
	WebElement signInButton;
	
	@FindBy (xpath="//input[@id='email']")
	WebElement userID;

	@FindBy (xpath="//input[@title='Password']")
	WebElement passWord;
	
	@FindBy (xpath="//button[@class='action login primary']")
	WebElement signInContinue;
	
	@FindBy (xpath="/html/body/div[2]/header/div[1]/div/ul/li[1]/span")
	WebElement account;
	
	
	public void signInCred(String ID,String Pass) {
		signInButton.click();
		userID.sendKeys(ID);
		passWord.sendKeys(Pass);
		
	}
	
	public void signIn() {
		signInContinue.click();
	}
	
	public String accountVerify() {
		String acc=account.getText();
		
		return acc;
	}
	
	
	
}

	

