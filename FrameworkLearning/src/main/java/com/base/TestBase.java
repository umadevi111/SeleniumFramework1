package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import config.propertiesFile;

public class TestBase {
	public static WebDriver driver;
	public ExtentHtmlReporter reporter;
	public ExtentReports extent;
	public static String browsername = null;

	public static WebDriver getDriver() {
		return driver;
	}

	@BeforeTest
	public void reportSetUp() {
		 reporter = new ExtentHtmlReporter("extent.html");
		 extent = new ExtentReports();
		 extent.attachReporter(reporter);
		 
	}
	
	
	@BeforeMethod
	public WebDriver launchBrowser() {
		propertiesFile.getProperties();
		if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		//DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability("ignoreProtectedModeSettings",true);
		//System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
		//driver=new InternetExplorerDriver(cap);
		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		}
		return driver;

	}
	
	
	
	
	
@AfterMethod
public void closeBrowser() {
	closeDriver();
}

	@AfterTest(alwaysRun = true)
	public void tearDown() {
	    extent.flush();
		System.out.println("Successfully");
		propertiesFile.setProperties();
		
	}
	
public void closeDriver() {
		System.out.println("Closing driver");
		if (getDriver() != null) {
			try {

				getDriver().quit();

			} catch (Exception e) {

			}
		}
	}
}
