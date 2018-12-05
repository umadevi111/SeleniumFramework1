package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestBaseFramework {
	public static String browser;
	public static WebDriver driver;
	public static String url;
	ExtentHtmlReporter extent;
	ExtentReports reports;
	public static long pagetimeOuts;

	public static WebDriver getDriver() {
		return driver;
	}


	@BeforeTest
	public static void setUpBrowser() {
		browser = System.getProperty("browser");
		url = System.getProperty("ApplicationUrl");
		pagetimeOuts = Long.parseLong(System.getProperty("pageWaitAndWaitTimeOut"));

		switch(browser) {

		case "chrome":
			System.out.println("Browser Location :"+ System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(pagetimeOuts, TimeUnit.SECONDS);
			System.out.println("Going to launch Chrome Browser");
			break;

		case "ie":
			System.out.println("Browser Location: "+System.getProperty("user.dir")+"/drivers/IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(pagetimeOuts, TimeUnit.SECONDS);

			System.out.println("Going to launch IE browser");
			break;

		default : 
			new RuntimeException("Unsupported Browser");
		}

		driver.manage().deleteAllCookies();
		System.out.println("Application URL: "+url);
		driver.navigate().to(url);
		driver.manage().window().maximize();

	}

	/*
	 * run afterMethod
	 */

	@AfterTest(alwaysRun = true)
	public void afterTestMethod() {
		closeDriver();
	}

	public void closeDriver() {
		System.out.println("Closing driver!!");
		if(getDriver()!=null) {
			try {
				getDriver().quit();
			}
			catch(Exception e ){

			}
		}
	}

//	@BeforeSuite
//	public void generateReports(String path) {
//		extent= new ExtentHtmlReporter("extentReport.html");
//		reports= new ExtentReports();
//		reports.attachReporter(extent);
//	}
//	@AfterSuite
//	public void flushReports() {
//		reports.flush();	}
}
