package test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGMultiBrowserTesting {
	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");	


	@Parameters("browsername")
	@BeforeTest
	public void setUp(String browsername) {
		System.out.println("Browser name is :"+browsername);
		System.out.println("Thread Id: "+Thread.currentThread().getName());
		
		switch(browsername) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
			driver = new ChromeDriver();
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//			WebDriverWait wait= new WebDriverWait(driver,30);
//			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.name("")));
			
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
					.ignoring(NoSuchElementException.class);
			
			
			
			
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver", projectPath+"/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
			
			default:
			System.out.println("Un supported browser exception");
			
		}
	}

	@Test
	public void test1() throws InterruptedException {
		driver.get("https://google.com");
		Thread.sleep(3000);
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test Completed successfully");
	}
}
