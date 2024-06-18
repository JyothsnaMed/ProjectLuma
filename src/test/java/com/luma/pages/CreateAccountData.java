package com.luma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.base.BaseClass;

public class CreateAccountData extends BaseClass{
	
	public CreateAccountData (WebDriver driver) {
	
		PageFactory.initElements(driver, this);	
		
	}

	
	@FindBy (xpath="//ul[@class='header links']/child::li[3]/child::a[1]")
	WebElement createButton;
	
	@FindBy (xpath="//input[@id='firstname']")
	WebElement firstName;
	
	@FindBy (xpath="//input[@id='lastname']")
	WebElement lastName;
	
	@FindBy (xpath="//input[@name='email']")
	WebElement eMail;
	
	@FindBy (xpath="//input[@name='password']")
	WebElement passWord;
	
	@FindBy (xpath="//input[@name='password_confirmation']")
	WebElement passCon;
	
	@FindBy (xpath="//button[@class='action submit primary']")
	WebElement createAccBtn;
	
	@FindBy (xpath="//div[@class='page-title-wrapper']/descendant::span")
	WebElement account;
	
	public void createUser(String first, String last, String mail) {
		createButton.click();
		firstName.sendKeys(first);
		lastName.sendKeys(last);
		eMail.sendKeys(mail);
		
	}

public void userPassword(String pass,String conPass) {
		
		passWord.sendKeys(pass);
		passCon.sendKeys(conPass);
		
	}
	
	public void createAccount() {
		createAccBtn.click();
	}

	
	public String user() {
		String acc=account.getText();
		return acc;
	}
		
}
	

