package com.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.base.TestBase;
import com.pages.RegisterPage;

public class RegisterPageTest extends TestBase{

	RegisterPage objRegisterPage;
	ExtentTest test;
	
	@Test
	public void registerPageTest() throws IOException {
		
		test=extent.createTest("Register Page Test","Sending few inputs and submitting it for Registration");
		test.pass("status for Pass");
		test.log(Status.INFO, "Usage of LOG status");
		objRegisterPage = new RegisterPage(driver);
		objRegisterPage.initElements().registerUser("First Name", "Lase Name", "Email.com", "CLIPPERTON ISLAND");
		
		test.info("Usage of INFO");
		//test.fail("Status of Fail");
		
		test.addScreenCaptureFromPath("screenshot.png");
		
	}
	@Test
	public void registerPageTest2() throws IOException {
		
		test=extent.createTest("registerPageTest2","--------------------");
		test.pass("!!!!!!!!!!!!");
		test.log(Status.INFO, "@@@@@@@@@@@@@@");
		objRegisterPage = new RegisterPage(driver);
		objRegisterPage.initElements().registerUser("First Name", "Lase Name", "Email.com", "CLIPPERTON ISLAND");
		
		test.info("Usage of saass");
		//test.fail("Status of Fail");
		
		test.addScreenCaptureFromPath("screenshot1.png");
		
	}
}
