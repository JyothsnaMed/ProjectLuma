package com.luma.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HybridFrameWorks {
	WebDriver driver;
	
	Action perform;
	public HybridFrameWorks(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@FindBy (xpath="//div[@class='panel header']/descendant::li[2]/descendant::a[1]")
	WebElement signInButton;
	
	@FindBy (xpath="//input[@id='email']")
	WebElement userID;

	@FindBy (xpath="//input[@title='Password']")
	WebElement passWord;
	
	@FindBy (xpath="//button[@class='action login primary']")
	WebElement signInContinue;
	

	@FindBy (xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a']")
	WebElement clickOnsignout;

		
	public void openUrl()
	{
		driver.get("https://magento.softwaretestingboard.com/");
	}
	
	public void clickOnSignIn () {
		signInButton.click();
	}	
	public void enterEmail (String nm) {
		userID.sendKeys(nm);
	}
	public void enterPassword (String pw) {	
		passWord.sendKeys(pw);
	}
	public void clickOncontinue () throws InterruptedException {
		signInContinue.click();
		Thread.sleep(5000);
		driver.close();
	}		
	
	
}
	

	
	
	


	
	
	
