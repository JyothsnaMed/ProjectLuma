package com.luma.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.luma.base.BaseClass;
import com.luma.pages.RegistrationPage;


public class TC_RegisterPage extends BaseClass {
	
	@Test(priority=1)
	public void test1() {
		
		TC_LinkTest tc1=new TC_LinkTest();
		tc1.linkTest();
	}
		@Test(priority=2)
		public void test2() {
			
		RegistrationPage rp=new RegistrationPage(driver);
		
		rp.createUser("Apples","Happy","happyapple@agh.com");
		
		rp.userPassword("TesT@1234", "TesT@1234");
		
		rp.createAccount();
		
		}
		
	@Test(priority=3)
	public void testUserVerify() {
		RegistrationPage rp=new RegistrationPage(driver);
		String Actual=rp.user();
		System.out.println("Actual: "+Actual);
		String Expected="My Account";
		System.out.println("Expected: "+Expected);
		
		Assert.assertEquals(Actual, Expected);
		//The user is already created, which is why it will fail
				
	}
		
	}


