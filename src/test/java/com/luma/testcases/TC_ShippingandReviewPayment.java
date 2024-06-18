package com.luma.testcases;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.luma.base.BaseClass;
import com.luma.pages.AddToCartandValidate;
import com.luma.pages.LoginPage;
import com.luma.pages.ShippingandPaymentDetails;

public class TC_ShippingandReviewPayment extends BaseClass {
	
	public LoginPage lp;
	AddToCartandValidate pg;
	ShippingandPaymentDetails page;
	
	@Test(priority = 1)
	public void test1() {

		TC_LinkTest tc1 = new TC_LinkTest();
		tc1.linkTest();
	}

	@Test(priority=2)
	public void test2() {
	lp=new LoginPage(driver);
	lp.signInCred("happyapple@agh.com","TesT@1234");
	lp.signIn();
	}
	
	@Test(priority=3)
	public void test3() throws InterruptedException {
	pg=new AddToCartandValidate(driver);
		Assert.assertTrue(((AddToCartandValidate) pg).validateAddtoCart(driver));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		
	}
	
	@Test(priority=4)
	public void test4() throws InterruptedException {
		ShippingandPaymentDetails sPay=PageFactory.initElements(driver, ShippingandPaymentDetails.class);
		sPay.ShipandPay("132", "ABE", "EF", "IH", "33458", "19875631");
		
	}

}
