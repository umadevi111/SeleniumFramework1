package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser1 {

	public static void main(String[] args) throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		System.out.println(	System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe"));
		WebDriver driver =new ChromeDriver();
		
		//browse 
		driver.get("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium step by step");
		searchBox.sendKeys(Keys.ENTER);

		System.out.println(driver.findElement(By.xpath("//input")));

		List<WebElement> ele = driver.findElements(By.xpath("//input"));
		System.out.println(ele.size());

		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}
}
