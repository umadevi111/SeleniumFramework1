package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com/");
	//driver.get("https://www.flipkart.com/");
	
	System.out.println("URL: "+driver.getCurrentUrl());
	System.out.println("Title: "+driver.getTitle());
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	driver.navigate().forward();
	Thread.sleep(3000);
	
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.close();
}
}
