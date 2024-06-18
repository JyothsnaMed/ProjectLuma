package com.luma.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.luma.base.BaseClass;

public class AddToCartandValidate extends BaseClass {
	
	Action perform;
	public AddToCartandValidate(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		perform=new Action();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
				
	}

	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[1]/div/a/span/span/img")
	WebElement prodImage;
	@FindBy(xpath="//*[@id=\"option-label-size-143-item-168\"]")
	WebElement size;
	@FindBy(xpath="//*[@id=\"option-label-color-93-item-57\"]")
	WebElement color;
	@FindBy(xpath="//*[@id=\"qty\"]")
	WebElement txtQty;
	@FindBy (xpath="//button[@title='Add to Cart']")
	WebElement AddtoCartBtn;
	@FindBy (xpath="/html/body/div[2]/header/div[2]/div[1]/a")
	WebElement showCart;
	@FindBy (xpath="//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a/span")
	WebElement vandeCart;
	@FindBy (xpath="//*[@id=\"shopping-cart-table\"]/tbody/tr[2]/td/div/a[2]")
	WebElement editQty;
	@FindBy (xpath="//*[@id=\"qty\"]")
	WebElement sQty;
	@FindBy (xpath="//*[@id=\"product-updatecart-button\"]")
	WebElement updateCart;
	@FindBy (xpath="//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button")
	WebElement checkOutBtn;
	@FindBy (xpath="//*[@id=\"opc-sidebar\"]/div[1]/div")
	WebElement prodValidate;
	@FindBy (xpath="//*[@id=\"opc-sidebar\"]/div[1]/div/div[1]/strong/span[2]")
	WebElement qValidate;
	@FindBy (xpath="//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li/div/div/div[2]/span/span")
	WebElement cartText;
	
	
	public boolean validateAddtoCart(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		perform.scrollUsingJavaScriptExecutor(prodImage, driver);
		perform.MouseHover(prodImage, driver);
		perform.click(prodImage);
		perform.click(size);
		perform.click(color);
		Thread.sleep(3000);
		perform.clear(txtQty);
		Thread.sleep(3000);
		perform.setText("3", txtQty);
		perform.click(AddtoCartBtn);
		Thread.sleep(3000);
		perform.scrollUsingJavaScriptExecutor(showCart, driver);
		Thread.sleep(3000);
		perform.click(showCart);
		Thread.sleep(3000);
		perform.click(vandeCart);
		editQty.click();
		perform.clear(sQty);
		perform.setText("3", sQty);
		updateCart.click();
		perform.scrollUsingJavaScriptExecutor(checkOutBtn, driver);
		checkOutBtn.click();
		Thread.sleep(3000);
		prodValidate.click();
		perform.scrollUsingJavaScriptExecutor(cartText, driver);
		cartText.click();
		perform.validateText(driver, qValidate, "3 Item in Cart");
		return perform.validateText(driver, qValidate, "3 Item in Cart");

		
	}
	
	

}
