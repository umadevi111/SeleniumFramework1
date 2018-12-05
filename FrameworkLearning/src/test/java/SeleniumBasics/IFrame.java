package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/selenium/deprecated.html");
	
	driver.switchTo().frame("classFrame").findElement(By.linkText("com.thoughtworks.selenium")).click();
	Thread.sleep(5000);
	driver.close();
}
}
