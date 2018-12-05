package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement email = driver.findElement(By.id("email"));
	
	Actions act = new Actions(driver);
	act.moveToElement(email).click()
	.keyDown(email, Keys.SHIFT)
	.sendKeys("Emailid")
	.keyUp(email,Keys.SHIFT)
	.contextClick()
	.doubleClick()
	.build()
	.perform();
	Thread.sleep(3000);
	
	driver.close();
}
}
