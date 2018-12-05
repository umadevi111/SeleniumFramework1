package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDownload {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/upload/");
	
	WebElement choosefile = driver.findElement(By.id("uploadfile_0"));
	choosefile.sendKeys("D:\\Label.xlsx");
	driver.findElement(By.id("terms")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("submitbutton")).click();
	Thread.sleep(3000);
	
	WebElement success = 	driver.findElement(By.id("res"));
	if(success.isDisplayed()) {
		System.out.println(success.getText());
	}

	
	driver.close();
}
}
