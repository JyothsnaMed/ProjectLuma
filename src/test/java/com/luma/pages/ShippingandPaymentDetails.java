package com.luma.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.base.BaseClass;

public class ShippingandPaymentDetails extends BaseClass {
	
	Action Shipment;
	public ShippingandPaymentDetails (WebDriver driver) {
		PageFactory.initElements(driver, this);
		Shipment=new Action();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.navigate().to("https://magento.softwaretestingboard.com/checkout/cart/");
	}
	@FindBy (xpath="//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[2]/a")
	WebElement mulAddBtn;
	@FindBy (xpath="//*[@id=\"checkout_multishipping_form\"]/div[3]/div[2]/button[2]")
	WebElement newAddBtn;
	@FindBy (xpath="//*[@id=\"street_1\"]")
	WebElement sAdd1;
	@FindBy (xpath="//*[@id=\"street_2\"]")
	WebElement sAdd2;
	@FindBy (xpath="//*[@id=\"street_3\"]")
	WebElement sAdd3;
	@FindBy (xpath="//*[@id=\"city\"]")
	WebElement cityAdd;
	@FindBy (xpath="//*[@id=\"region_id\"]/option[58]")
	WebElement stateAdd;
	@FindBy (xpath="//*[@id=\"zip\"]")
	WebElement zipAdd;
	@FindBy (xpath="//*[@id=\"telephone\"]")
	WebElement phAdd;
	@FindBy (xpath="//*[@id=\"primary_shipping\"]")
	WebElement sRadio;
	@FindBy (xpath="//*[@id=\"form-validate\"]/div/div[1]/button")
	WebElement savAdd;
	@FindBy (xpath="//*[@id=\"checkout_multishipping_form\"]/div[3]/div[1]/button")
	WebElement shInfo;
	@FindBy (xpath="//input[@value='tablerate_bestway']")
	WebElement shWay;
	@FindBy (xpath="//*[@id=\"shipping_method_form\"]/div[2]/div[1]/button")
	WebElement conBil;
	@FindBy (xpath="//*[@id=\"payment-continue\"]")
	WebElement conRev;
	@FindBy (xpath="//*[@id=\"checkout-review-submit\"]/div[1]/strong[1]")
	WebElement grdTot;
	@FindBy (xpath="//button[@class='action primary submit']")
	WebElement plcOrder;
	@FindBy (xpath="//*[@id=\"maincontent\"]/div[1]/h1/span")
	WebElement conOrder;
	@FindBy (xpath="//*[@id=\"maincontent\"]/div[3]/div/form/div/h3")
	WebElement sucOrder;
	

	public Boolean clickBtn() throws InterruptedException {
		Shipment.MouseHover(mulAddBtn, driver);
		mulAddBtn.click();
		newAddBtn.click();
		Thread.sleep(3000);
		sAdd1.sendKeys("132");
		sAdd2.sendKeys("ABE");
		sAdd3.sendKeys("EF");
		cityAdd.sendKeys("IH");
		stateAdd.click();
		zipAdd.sendKeys("33458");
		phAdd.sendKeys("19875631");
		sRadio.click();
		savAdd.click();
		Thread.sleep(3000);
		Shipment.scrollUsingJavaScriptExecutor(shInfo, driver);
		Thread.sleep(3000);
		shInfo.click();
		Thread.sleep(3000);
		shWay.click();
		Thread.sleep(3000);
		conBil.click();
		Thread.sleep(3000);
		conRev.click();
		Thread.sleep(3000);
		Shipment.scrollUsingJavaScriptExecutor(grdTot, driver);
		Thread.sleep(3000);
		plcOrder.click();
		Thread.sleep(3000);
		conOrder.getText();
		Shipment.validateText(driver, sucOrder, "Successfully ordered");
		return Shipment.validateText(driver, sucOrder, "Successfully ordered");
		
	}
	
	public void ShipandPay(String arg, String string, String string2, String string3, String string4, String string5) throws InterruptedException {
		clickBtn();
		
	}
		
		
	
	
	

}
